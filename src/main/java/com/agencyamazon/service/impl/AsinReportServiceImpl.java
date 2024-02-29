package com.agencyamazon.service.impl;

import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import com.agencyamazon.mapper.AsinReportMapper;
import com.agencyamazon.repository.AsinReportsRepository;
import com.agencyamazon.service.AsinReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AsinReportServiceImpl implements AsinReportService {
    private final AsinReportsRepository asinReportsRepository;
    private final AsinReportMapper asinReportMapper;

    @Override
    public List<SalesAndTrafficByAsinDto> getReportsByAsin(List<String> asins) {
        return asinReportsRepository.findAllByParentAsinIn(asins).stream()
                .map(asinReportMapper::toDto)
                .toList();
    }

    @Override
    public List<SalesAndTrafficByAsinDto> getAll(Pageable pageable) {
        return asinReportsRepository.findAll(pageable).stream()
                .map(asinReportMapper::toDto)
                .toList();
    }
}
