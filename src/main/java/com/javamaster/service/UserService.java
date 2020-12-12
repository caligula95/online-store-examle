package com.javamaster.service;

import com.javamaster.entity.UserEntity;

public interface UserService {

    UserEntity findOrCreateUser(String name, String surname,
                                String phone, String email,
                                String address);

    UserEntity findByEmail(String email);

    UserEntity findByEmailAndPassword(String email, String password);

    void setPassword(Integer userId, String password);
}
