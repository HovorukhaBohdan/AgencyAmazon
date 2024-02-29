package com.agencyamazon.dto.external;

import com.agencyamazon.dto.external.reportSpecification.ReportSpecification;
import com.agencyamazon.dto.external.salesAndTrafficByAsin.SalesAndTrafficByAsinExternalDto;
import com.agencyamazon.dto.external.salesAndTrafficByDate.SalesAndTrafficByDateExternalDto;
import java.util.List;
import lombok.Data;

@Data
public class ReportInfoDto {
    private ReportSpecification reportSpecification;
    private List<SalesAndTrafficByDateExternalDto> salesAndTrafficByDate;
    private List<SalesAndTrafficByAsinExternalDto> salesAndTrafficByAsin;
}
