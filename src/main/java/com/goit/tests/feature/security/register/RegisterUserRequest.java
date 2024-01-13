package com.goit.tests.feature.security.register;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String username;
    private String password;
}
