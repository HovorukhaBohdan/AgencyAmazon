package com.agencyamazon.dto.external.salesAndTrafficByDate.salesByDate;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AverageSalesPerOrderItem {
    private BigDecimal amount;
    private String currencyCode;
}
