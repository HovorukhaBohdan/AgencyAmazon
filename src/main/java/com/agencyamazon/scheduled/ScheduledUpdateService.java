package com.agencyamazon.scheduled;

import com.agencyamazon.cache.CacheManagementService;
import com.agencyamazon.dto.external.ReportInfoDto;
import com.agencyamazon.mapper.AsinReportMapper;
import com.agencyamazon.mapper.DateReportMapper;
import com.agencyamazon.repository.AsinReportsRepository;
import com.agencyamazon.repository.DateReportsRepository;
import com.agencyamazon.service.FileReaderService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
@RequiredArgsConstructor
public class ScheduledUpdateService {
    private static final String filePath = "src/main/resources/json/test_report.json";
    private final FileReaderService fileReaderService;
    private final AsinReportsRepository asinReportsRepository;
    private final DateReportsRepository dateReportsRepository;
    private final AsinReportMapper asinReportMapper;
    private final DateReportMapper dateReportMapper;
    private final CacheManagementService cacheManagementService;

    @Scheduled(fixedRate = 300_000)
    @CacheEvict(cacheNames = {
            "reportByDate",
            "reportsByDateBetween",
            "allReportsByDates",
            "reportByAsin",
            "allReportByAsins"
    })
    public void scheduledDatabaseUpdate() {
        ReportInfoDto updatedReport = fileReaderService.readFile(filePath);
        cacheManagementService.clearCache();

        asinReportsRepository.saveAll(updatedReport.getSalesAndTrafficByAsin().stream()
                .map(asinReportMapper::toModel)
                .toList());

        dateReportsRepository.saveAll(updatedReport.getSalesAndTrafficByDate().stream()
                .map(dateReportMapper::toModel)
                .toList());
    }
}
