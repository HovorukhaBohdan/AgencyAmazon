package com.agencyamazon.service.impl;

import com.agencyamazon.dto.internal.SalesAndTrafficByDateDto;

import java.time.LocalDate;
import java.util.List;

import com.agencyamazon.exception.EntityNotFoundException;
import com.agencyamazon.mapper.DateReportMapper;
import com.agencyamazon.model.SalesAndTrafficByDate;
import com.agencyamazon.repository.DateReportsRepository;
import com.agencyamazon.service.DateReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DateReportServiceImpl implements DateReportService {
    private final DateReportsRepository dateReportsRepository;
    private final DateReportMapper dateReportMapper;

    @Override
    public SalesAndTrafficByDateDto getByDate(LocalDate date) {
        SalesAndTrafficByDate report = dateReportsRepository.findByDate(date).orElseThrow(
                () -> new EntityNotFoundException("Can't get report by date: " + date)
        );

        return dateReportMapper.toDto(report);
    }

    @Override
    public List<SalesAndTrafficByDateDto> getByDateBetween(LocalDate dateFrom, LocalDate dateTo) {
        return dateReportsRepository.findAllByDateBetween(dateFrom, dateTo).stream()
                .map(dateReportMapper::toDto)
                .toList();
    }

    @Override
    public List<SalesAndTrafficByDateDto> getAll(Pageable pageable) {
        return dateReportsRepository.findAll(pageable).stream()
                .map(dateReportMapper::toDto)
                .toList();
    }
}
