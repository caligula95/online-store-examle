package com.javamaster.controller.dto;

import com.javamaster.entity.ProductEntity;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@ToString(exclude = "password")
public class FinishPurchaseRequest {

    @NotNull
    private List<ProductEntity> productIds;
    @NotEmpty
    private String userName;
    private String userSurname;
    @NotEmpty
    private String email;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String address;
    private String comment;
    private String password;
}
