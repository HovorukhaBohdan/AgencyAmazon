package com.agencyamazon.service;

import com.agencyamazon.dto.internal.SalesAndTrafficByDateDto;
import java.time.LocalDate;
import java.util.List;

public interface DateReportService {
    SalesAndTrafficByDateDto getByDate(LocalDate date);

    List<SalesAndTrafficByDateDto> getByDateBetween(LocalDate dateFrom, LocalDate dateTo);
}
