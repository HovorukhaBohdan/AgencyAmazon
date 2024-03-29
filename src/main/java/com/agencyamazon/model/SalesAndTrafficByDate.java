package com.agencyamazon.model;

import com.agencyamazon.dto.external.date.sales.SalesByDate;
import com.agencyamazon.dto.external.date.traffic.TrafficByDate;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reports-by-date")
@Getter
@Setter
public class SalesAndTrafficByDate {
    @Id
    private String id;

    private LocalDate date;

    private SalesByDate salesByDate;

    private TrafficByDate trafficByDate;
}
