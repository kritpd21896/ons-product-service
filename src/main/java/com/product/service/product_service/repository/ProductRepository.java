package com.product.service.product_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.service.product_service.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByBrandId(Long brandId);

    @Query(value = "SELECT * FROM product", nativeQuery = true)
    List<Product> findAllProducts();
}
