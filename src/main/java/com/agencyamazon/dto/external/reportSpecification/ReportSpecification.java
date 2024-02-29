package com.agencyamazon.dto.external.reportSpecification;

import com.agencyamazon.dto.external.reportSpecification.ReportOptions;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ReportSpecification {
    private String reportType;
    private ReportOptions reportOptions;
    private LocalDate dataStartTime;
    private LocalDate dataEndTime;
    private List<String> marketplaceIds;
}
