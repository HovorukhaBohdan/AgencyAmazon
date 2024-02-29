package com.agencyamazon.dto.external;

import com.agencyamazon.dto.external.reportSpecification.ReportSpecification;
import com.agencyamazon.dto.external.salesAndTrafficByAsin.SalesAndTrafficByAsin;
import com.agencyamazon.dto.external.salesAndTrafficByDate.SalesAndTrafficByDate;
import java.util.List;
import lombok.Data;

@Data
public class ReportResponseInfoDto {
    private ReportSpecification reportSpecification;
    private List<SalesAndTrafficByDate> salesAndTrafficByDate;
    private List<SalesAndTrafficByAsin> salesAndTrafficByAsin;
}
