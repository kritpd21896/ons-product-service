package com.product.service.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.product_service.entity.ProductImages;
import com.product.service.product_service.service.ProductImagesService;

@RestController
@RequestMapping("/productImages")
public class ProductImagesController {

    @Autowired
    private ProductImagesService productImagesService;

    @GetMapping("/{productId}")
    public ResponseEntity<List<ProductImages>> getImagesByProductId(@PathVariable Long productId) {
        List<ProductImages> images = productImagesService.getImagesByProductId(productId);
        return ResponseEntity.ok(images);
    }
    // Other endpoints can be added here as needed
}
