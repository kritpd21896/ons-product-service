package com.product.service.product_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.service.product_service.entity.Brand;
import com.product.service.product_service.entity.Product;
import com.product.service.product_service.repository.BrandRepository;
import com.product.service.product_service.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BrandRepository brandRepository;

    public List<Product> getProductsByBrand(Long brandId) {
        return productRepository.findByBrandId(brandId);
    }

    public List<Product> getAllProducts() {
        List<Product> listProduct = productRepository.findAllProducts();
        return listProduct;
    }

    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }
}
