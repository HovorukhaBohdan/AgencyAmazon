package com.agencyamazon.service;

import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import java.util.List;

public interface AsinReportService {
    List<SalesAndTrafficByAsinDto> getReportsByAsin(List<String> asins);
}
