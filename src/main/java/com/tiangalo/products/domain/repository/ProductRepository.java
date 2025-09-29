package com.tiangalo.products.domain.repository;

import java.util.List;
import java.util.Optional;

import com.tiangalo.products.domain.model.Product;

public interface ProductRepository {
    Product save(Product product);
    Optional<Product> findById(Long id);
    List<Product> findAll();
    void delete(Long id);
}
