package com.javamaster.repository;

import com.javamaster.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntityRepository extends JpaRepository<OrderEntity, Integer> {
}
