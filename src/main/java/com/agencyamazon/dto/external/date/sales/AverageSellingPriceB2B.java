package com.agencyamazon.dto.external.date.sales;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class AverageSellingPriceB2B {
    private BigDecimal amount;
    private String currencyCode;
}
