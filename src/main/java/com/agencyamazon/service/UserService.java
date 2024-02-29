package com.agencyamazon.service;

import com.agencyamazon.dto.internal.UserRegistrationRequestDto;
import com.agencyamazon.dto.internal.UserResponseDto;
import com.agencyamazon.exception.RegistrationException;

public interface UserService {
    UserResponseDto register(UserRegistrationRequestDto requestDto) throws RegistrationException;
}
