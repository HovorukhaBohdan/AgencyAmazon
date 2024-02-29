package com.agencyamazon.service.impl;

import com.agencyamazon.dto.internal.UserRegistrationRequestDto;
import com.agencyamazon.dto.internal.UserResponseDto;
import com.agencyamazon.exception.RegistrationException;
import com.agencyamazon.mapper.UserMapper;
import com.agencyamazon.model.Role;
import com.agencyamazon.model.User;
import com.agencyamazon.repository.RoleRepository;
import com.agencyamazon.repository.UserRepository;
import com.agencyamazon.service.UserService;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDto register(UserRegistrationRequestDto requestDto)
            throws RegistrationException {
        User user = userMapper.toModel(requestDto);

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            throw new RegistrationException(
                    "User with email: %s is already exists".formatted(user.getEmail())
            );
        }

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        Role defaultRole = roleRepository.findByRoleName(Role.RoleName.USER);
        user.setRoles(Set.of(defaultRole));

        return userMapper.toDto(userRepository.save(user));
    }
}
