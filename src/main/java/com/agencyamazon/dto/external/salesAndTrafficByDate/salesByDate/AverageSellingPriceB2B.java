package com.agencyamazon.dto.external.salesAndTrafficByDate.salesByDate;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AverageSellingPriceB2B {
    private BigDecimal amount;
    private String currencyCode;
}
