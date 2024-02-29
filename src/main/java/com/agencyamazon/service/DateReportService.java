package com.agencyamazon.service;

import com.agencyamazon.dto.internal.SalesAndTrafficByDateDto;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface DateReportService {
    List<SalesAndTrafficByDateDto> getByDate(LocalDate date);

    List<SalesAndTrafficByDateDto> getByDateBetween(LocalDate dateFrom, LocalDate dateTo);

    List<SalesAndTrafficByDateDto> getAll(Pageable pageable);
}
