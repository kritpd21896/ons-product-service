package com.product.service.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.product_service.entity.Brand;
import com.product.service.product_service.entity.Product;
import com.product.service.product_service.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/brand/{brandId}")
    public List<Product> getProductsByBrand(@PathVariable Long brandId) {
        return productService.getProductsByBrand(brandId);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/brands")
    public List<Brand> getAllBrands() {
        return productService.getAllBrands();
    }
}
