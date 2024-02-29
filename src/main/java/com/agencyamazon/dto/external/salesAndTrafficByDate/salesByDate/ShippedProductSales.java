package com.agencyamazon.dto.external.salesAndTrafficByDate.salesByDate;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ShippedProductSales {
    private BigDecimal amount;
    private String currencyCode;
}
