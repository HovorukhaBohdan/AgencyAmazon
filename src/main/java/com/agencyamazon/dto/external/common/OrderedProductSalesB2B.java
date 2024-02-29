package com.agencyamazon.dto.external.common;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderedProductSalesB2B {
    private BigDecimal amount;
    private String currencyCode;
}
