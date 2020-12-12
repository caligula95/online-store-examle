package com.javamaster.controller.auth;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AuthRequest {
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
}
