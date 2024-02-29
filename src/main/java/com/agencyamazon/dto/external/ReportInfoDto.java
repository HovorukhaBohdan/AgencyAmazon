package com.agencyamazon.dto.external;

import com.agencyamazon.dto.external.asin.SalesAndTrafficByAsinExternalDto;
import com.agencyamazon.dto.external.date.SalesAndTrafficByDateExternalDto;
import com.agencyamazon.dto.external.specification.ReportSpecification;
import java.util.List;
import lombok.Data;

@Data
public class ReportInfoDto {
    private ReportSpecification reportSpecification;
    private List<SalesAndTrafficByDateExternalDto> salesAndTrafficByDate;
    private List<SalesAndTrafficByAsinExternalDto> salesAndTrafficByAsin;
}
