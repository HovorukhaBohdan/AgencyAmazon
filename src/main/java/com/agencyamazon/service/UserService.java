package com.agencyamazon.service;

import com.agencyamazon.dto.UserRegistrationRequestDto;
import com.agencyamazon.dto.UserResponseDto;
import com.agencyamazon.exception.RegistrationException;

public interface UserService {
    UserResponseDto register(UserRegistrationRequestDto requestDto) throws RegistrationException;
}
