package com.agencyamazon.service;

import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface AsinReportService {
    List<SalesAndTrafficByAsinDto> getReportsByAsin(List<String> asins);

    List<SalesAndTrafficByAsinDto> getAllReportsByAllAsins(Pageable pageable);
}
