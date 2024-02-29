package com.agencyamazon.dto.internal;

import com.agencyamazon.dto.external.salesAndTrafficByAsin.SalesByAsin;
import com.agencyamazon.dto.external.salesAndTrafficByAsin.TrafficByAsin;
import lombok.Data;

@Data
public class SalesAndTrafficByAsinDto {
    private String id;
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
