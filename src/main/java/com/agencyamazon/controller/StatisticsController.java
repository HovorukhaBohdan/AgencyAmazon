package com.agencyamazon.controller;

import com.agencyamazon.dto.internal.SalesAndTrafficByDateDto;
import com.agencyamazon.service.impl.DateReportService;
import java.time.LocalDate;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
public class StatisticsController {
    private final DateReportService dateReportService;

    @GetMapping("/by-date")
    public SalesAndTrafficByDateDto getAllReportsByDate(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        return dateReportService.getByDate(date);
    }

    @GetMapping("/by-date-between")
    public List<SalesAndTrafficByDateDto> getAllReportsByDateBetween(
            @RequestParam("dateFrom")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFrom,
            @RequestParam("dateTo")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateTo
    ) {
        return dateReportService.getByDateBetween(dateFrom, dateTo);
    }
}
