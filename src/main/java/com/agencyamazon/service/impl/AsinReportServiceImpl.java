package com.agencyamazon.service.impl;

import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import com.agencyamazon.mapper.AsinReportMapper;
import com.agencyamazon.repository.AsinReportsRepository;
import com.agencyamazon.service.AsinReportService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AsinReportServiceImpl implements AsinReportService {
    private final AsinReportsRepository asinReportsRepository;
    private final AsinReportMapper asinReportMapper;

    @Override
    @CachePut("reportByAsin")
    public List<SalesAndTrafficByAsinDto> getReportsByAsin(List<String> asins) {
        return asinReportsRepository.findAllByParentAsinIn(asins).stream()
                .map(asinReportMapper::toDto)
                .toList();
    }

    @Override
    @CachePut("allReportByAsins")
    public List<SalesAndTrafficByAsinDto> getAllReportsByAllAsins(Pageable pageable) {
        return asinReportsRepository.findAll(pageable).stream()
                .map(asinReportMapper::toDto)
                .toList();
    }
}
