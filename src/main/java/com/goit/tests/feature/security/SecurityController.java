package com.goit.tests.feature.security;

import com.goit.tests.feature.security.register.RegisterUserRequest;
import com.goit.tests.feature.security.register.RegisterUserResponse;
import com.goit.tests.feature.security.register.RegisterUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SecurityController {
    private final RegisterUserService registerUserService;

    @PostMapping("/api/v1/user/register")
    public RegisterUserResponse register(@RequestBody RegisterUserRequest request) {
        return registerUserService.register(request);
    }
}
