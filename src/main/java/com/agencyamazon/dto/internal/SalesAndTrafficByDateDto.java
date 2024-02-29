package com.agencyamazon.dto.internal;

import com.agencyamazon.dto.external.date.sales.SalesByDate;
import com.agencyamazon.dto.external.date.traffic.TrafficByDate;
import java.time.LocalDate;
import lombok.Data;

@Data
public class SalesAndTrafficByDateDto {
    private String id;
    private LocalDate date;
    private SalesByDate salesByDate;
    private TrafficByDate trafficByDate;
}
