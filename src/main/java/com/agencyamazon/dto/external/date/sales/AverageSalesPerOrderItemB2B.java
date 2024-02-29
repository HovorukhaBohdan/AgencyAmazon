package com.agencyamazon.dto.external.date.sales;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class AverageSalesPerOrderItemB2B {
    private BigDecimal amount;
    private String currencyCode;
}
