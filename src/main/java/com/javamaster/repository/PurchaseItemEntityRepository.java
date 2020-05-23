package com.javamaster.repository;

import com.javamaster.entity.PurchaseItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemEntityRepository extends JpaRepository<PurchaseItemEntity, Integer> {
}
