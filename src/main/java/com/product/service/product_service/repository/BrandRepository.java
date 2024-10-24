package com.product.service.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.service.product_service.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
