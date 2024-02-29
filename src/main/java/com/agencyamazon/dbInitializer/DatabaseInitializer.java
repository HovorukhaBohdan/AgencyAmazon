package com.agencyamazon.dbInitializer;

import com.agencyamazon.dto.external.ReportInfoDto;
import com.agencyamazon.mapper.AsinReportMapper;
import com.agencyamazon.mapper.DateReportMapper;
import com.agencyamazon.repository.DateReportsRepository;
import com.agencyamazon.repository.AsinReportsRepository;
import com.agencyamazon.service.FileReaderService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer {
    private static final String filePath = "src/main/resources/json/test_report.json";
    private final FileReaderService fileReaderService;
    private final AsinReportsRepository asinRepository;
    private final DateReportsRepository dateRepository;
    private final AsinReportMapper asinReportMapper;
    private final DateReportMapper dateReportMapper;

    @PostConstruct
    private void initialize() throws IOException {
        ReportInfoDto report = fileReaderService.readFile(filePath);
        asinRepository.saveAll(report.getSalesAndTrafficByAsin().stream()
                .map(asinReportMapper::toModel)
                .toList());

        dateRepository.saveAll(report.getSalesAndTrafficByDate().stream()
                .map(dateReportMapper::toModel)
                .toList());
    }
}
