package com.agencyamazon.dto.external.salesAndTrafficByAsin;

import lombok.Data;

@Data
public class SalesAndTrafficByAsin {
    private String parentAsin;
    private SalesByAsin salesByAsin;
    private TrafficByAsin trafficByAsin;
}
