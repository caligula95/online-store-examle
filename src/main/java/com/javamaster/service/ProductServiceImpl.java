package com.javamaster.service;

import com.javamaster.entity.ProductEntity;
import com.javamaster.exception.NotFoundException;
import com.javamaster.repository.ProductEntityRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductEntityRepository productEntityRepository;

    @Override
    public List<ProductEntity> findAll() {
        return productEntityRepository.findAll();
    }

    @Override
    @SneakyThrows
    public ProductEntity findById(Integer id) {
        return productEntityRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found"));
    }
}
