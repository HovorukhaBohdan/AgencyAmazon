package com.agencyamazon.service.impl;

import com.agencyamazon.dto.UserRegistrationRequestDto;
import com.agencyamazon.dto.UserResponseDto;
import com.agencyamazon.exception.RegistrationException;
import com.agencyamazon.mapper.UserMapper;
import com.agencyamazon.model.User;
import com.agencyamazon.repository.UserRepository;
import com.agencyamazon.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponseDto register(UserRegistrationRequestDto requestDto)
            throws RegistrationException {
        User user = userMapper.toModel(requestDto);

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RegistrationException(
                    "User with email: %s is already exists".formatted(user.getEmail())
            );
        }

        return null;
    }
}
