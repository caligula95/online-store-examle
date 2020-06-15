package com.javamaster.controller;

import com.javamaster.entity.ProductEntity;
import com.javamaster.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductEntity> getAllProducts() {
        log.info("handling get all products request");
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public ProductEntity findById(@PathVariable Integer id) {
        log.info("handling get product by id: {}", id);
        return productService.findById(id);
    }
}
