package com.javamaster.entity;

import com.javamaster.entity.enums.UserStatus;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Table(name = "user_table")
@Entity
@Data
@ToString(exclude = "password")
public class UserEntity extends BaseEntity {

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String email;

    @Column
    private String phone;

    @Column
    private String password;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column
    private String address;

    @Column
    @Enumerated(EnumType.STRING)
    private UserStatus status;
}
