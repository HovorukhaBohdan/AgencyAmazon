package com.agencyamazon.mapper;

import com.agencyamazon.config.MapperConfig;
import com.agencyamazon.dto.external.salesAndTrafficByAsin.SalesAndTrafficByAsinExternalDto;
import com.agencyamazon.dto.internal.SalesAndTrafficByAsinDto;
import com.agencyamazon.model.SalesAndTrafficByAsin;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface AsinReportMapper {
    SalesAndTrafficByAsin toModel(SalesAndTrafficByAsinExternalDto asinDto);

    SalesAndTrafficByAsinDto toDto(SalesAndTrafficByAsin asinModel);
}
