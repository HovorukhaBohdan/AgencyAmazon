package com.agencyamazon.dto.external.date.sales;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class AverageSalesPerOrderItem {
    private BigDecimal amount;
    private String currencyCode;
}
