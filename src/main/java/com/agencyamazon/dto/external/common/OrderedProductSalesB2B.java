package com.agencyamazon.dto.external.common;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class OrderedProductSalesB2B {
    private BigDecimal amount;
    private String currencyCode;
}
