package com.javamaster.controller.auth;

import com.javamaster.config.jwt.JwtProvider;
import com.javamaster.entity.UserEntity;
import com.javamaster.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AuthController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtProvider jwtProvider;

    @PostMapping("/auth")
    public AuthResponse auth(@Valid @RequestBody AuthRequest request) {
        UserEntity userEntity = userService.findByEmailAndPassword(request.getEmail(), request.getPassword());
        String token = jwtProvider.generateToken(userEntity.getEmail());
        return new AuthResponse(token);
    }
}
