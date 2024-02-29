package com.agencyamazon.controller;

import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import com.agencyamazon.dto.internal.SalesAndTrafficByDateDto;
import com.agencyamazon.service.AsinReportService;
import com.agencyamazon.service.DateReportService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
@Tag(name = "Statistics controller", description = "Endpoint for getting reports")
public class StatisticsController {
    private final DateReportService dateReportService;
    private final AsinReportService asinReportsService;

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/by-date")
    @Operation(summary = "Get report by specified date")
    public SalesAndTrafficByDateDto getReportByDate(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date
    ) {
        return dateReportService.getByDate(date);
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/by-date-between")
    @Operation(summary = "Get reports for certain period of time")
    public List<SalesAndTrafficByDateDto> getAllReportsByDateBetween(
            @RequestParam("dateFrom")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateFrom,
            @RequestParam("dateTo")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateTo
    ) {
        return dateReportService.getByDateBetween(dateFrom, dateTo);
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/by-all-dates")
    @Operation(summary = "Get all reports by date")
    public List<SalesAndTrafficByDateDto> getAllReportsByAllDates(
            Pageable pageable
    ) {
        return dateReportService.getAll(pageable);
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("by-asin")
    @Operation(summary = "Get reports by specified ASINs")
    public List<SalesAndTrafficByAsinDto> getReportsByAsin(
            @RequestParam("asins") List<String> asins
    ) {
        return asinReportsService.getReportsByAsin(asins);
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/by-all-asins")
    @Operation(summary = "Get all reports by ASINs")
    public List<SalesAndTrafficByAsinDto> getAllReportsByAllAsins(
            Pageable pageable
    ) {
        return asinReportsService.getAllReportsByAllAsins(pageable);
    }
}
