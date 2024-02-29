package com.agencyamazon.mapper;

import com.agencyamazon.config.MapperConfig;
import com.agencyamazon.dto.external.salesAndTrafficByDate.SalesAndTrafficByDateExternalDto;
import com.agencyamazon.dto.internal.SalesAndTrafficByDateDto;
import com.agencyamazon.model.SalesAndTrafficByDate;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface DateReportMapper {
    SalesAndTrafficByDate toModel(SalesAndTrafficByDateExternalDto dateDto);

    SalesAndTrafficByDateDto toDto(SalesAndTrafficByDate dateModel);
}
