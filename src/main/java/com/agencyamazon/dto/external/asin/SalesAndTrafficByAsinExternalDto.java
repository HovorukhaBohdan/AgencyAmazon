package com.agencyamazon.dto.external.asin;

import lombok.Data;

@Data
public class SalesAndTrafficByAsinExternalDto {
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
