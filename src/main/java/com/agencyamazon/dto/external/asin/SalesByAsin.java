package com.agencyamazon.dto.external.asin;

import com.agencyamazon.dto.external.common.OrderedProductSales;
import com.agencyamazon.dto.external.common.OrderedProductSalesB2B;
import lombok.Data;

@Data
public class SalesByAsin {
    private int unitsOrdered;
    private int unitsOrderedB2B;
    private OrderedProductSales orderedProductSales;
    private OrderedProductSalesB2B orderedProductSalesB2B;
    private int totalOrderItems;
    private int totalOrderItemsB2B;
}
