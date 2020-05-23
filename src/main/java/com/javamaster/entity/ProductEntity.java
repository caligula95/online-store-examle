package com.javamaster.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "product_table")
@Entity
@Data
public class ProductEntity extends BaseEntity {

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String image;

    @Column
    private BigDecimal price;
}
