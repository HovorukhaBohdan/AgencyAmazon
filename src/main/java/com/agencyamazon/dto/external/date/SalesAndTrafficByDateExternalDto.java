package com.agencyamazon.dto.external.date;

import com.agencyamazon.dto.external.date.sales.SalesByDate;
import com.agencyamazon.dto.external.date.traffic.TrafficByDate;
import java.time.LocalDate;
import lombok.Data;

@Data
public class SalesAndTrafficByDateExternalDto {
    private LocalDate date;
    private SalesByDate salesByDate;
    private TrafficByDate trafficByDate;
}
