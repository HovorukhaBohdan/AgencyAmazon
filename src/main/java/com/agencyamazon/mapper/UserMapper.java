package com.agencyamazon.mapper;

import com.agencyamazon.config.MapperConfig;
import com.agencyamazon.dto.internal.UserRegistrationRequestDto;
import com.agencyamazon.dto.internal.UserResponseDto;
import com.agencyamazon.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserResponseDto toDto(User user);

    User toModel(UserRegistrationRequestDto requestDto);
}
