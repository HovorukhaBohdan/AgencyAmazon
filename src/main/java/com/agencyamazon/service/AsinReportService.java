package com.agencyamazon.service;

import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AsinReportService {
    List<SalesAndTrafficByAsinDto> getReportsByAsin(List<String> asins);

    List<SalesAndTrafficByAsinDto> getAll(Pageable pageable);
}
