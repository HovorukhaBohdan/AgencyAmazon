package com.agencyamazon.dto.external.common;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderedProductSales {
    private BigDecimal amount;
    private String currencyCode;
}
