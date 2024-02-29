package com.agencyamazon.dto.external.salesAndTrafficByDate;

import com.agencyamazon.dto.external.salesAndTrafficByDate.salesByDate.SalesByDate;
import com.agencyamazon.dto.external.salesAndTrafficByDate.trafficByDate.TrafficByDate;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SalesAndTrafficByDate {
    private LocalDate date;
    private SalesByDate salesByDate;
    private TrafficByDate trafficByDate;
}
