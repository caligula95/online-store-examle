package com.javamaster.entity;


import lombok.Data;

import javax.persistence.*;

@Table(name = "purchase_item_table")
@Entity
@Data
public class PurchaseItemEntity extends BaseEntity {

    @Column
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;
}
