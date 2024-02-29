package com.agencyamazon.controller;

import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import com.agencyamazon.dto.internal.SalesAndTrafficByDateDto;
import com.agencyamazon.service.AsinReportService;
import com.agencyamazon.service.DateReportService;

import java.time.LocalDate;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
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
    private final AsinReportService asinReportsService;

    @GetMapping("/by-date")
    public SalesAndTrafficByDateDto getReportByDate(
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

    @GetMapping("/by-all-dates")
    public List<SalesAndTrafficByDateDto> getAllReportsByAllDates(
            Pageable pageable
    ) {
        return dateReportService.getAll(pageable);
    }

    @GetMapping("by-asin")
    public List<SalesAndTrafficByAsinDto> getReportsByAsin(
            @RequestParam("asins") List<String> asins
    ) {
        return asinReportsService.getReportsByAsin(asins);
    }

    @GetMapping("/by-all-asins")
    public List<SalesAndTrafficByAsinDto> getAllReportsByAllAsins(
            Pageable pageable
    ) {
        return asinReportsService.getAll(pageable);
    }
}
