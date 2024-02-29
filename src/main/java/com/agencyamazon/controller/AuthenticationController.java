package com.agencyamazon.controller;

import com.agencyamazon.dto.internal.UserLoginRequestDto;
import com.agencyamazon.dto.internal.UserLoginResponseDto;
import com.agencyamazon.dto.internal.UserRegistrationRequestDto;
import com.agencyamazon.dto.internal.UserResponseDto;
import com.agencyamazon.exception.RegistrationException;
import com.agencyamazon.security.AuthenticationService;
import com.agencyamazon.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthenticationController {
    private final UserService userService;
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRegistrationRequestDto requestDto)
            throws RegistrationException {
        return userService.register(requestDto);
    }

    @PostMapping("/login")
    public UserLoginResponseDto login(@RequestBody @Valid UserLoginRequestDto requestDto) {
        return authenticationService.authenticate(requestDto);
    }
}
