package com.tiangalo.products.infrastructure.persistence.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.tiangalo.products.domain.model.Product;
import com.tiangalo.products.domain.repository.ProductRepository;

@Repository
public class ProductRepositoryAdapter implements ProductRepository{

    @Override
    public Product save(Product product) {
        return product;
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(Product.create(null, null, "test", null, 0, null, null, null));
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
