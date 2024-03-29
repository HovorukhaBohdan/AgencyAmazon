package com.agencyamazon.dto.external.specification;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
public class ReportSpecification {
    private String reportType;
    private ReportOptions reportOptions;
    private LocalDate dataStartTime;
    private LocalDate dataEndTime;
    private List<String> marketplaceIds;
}
