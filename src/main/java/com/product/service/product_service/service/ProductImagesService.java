package com.product.service.product_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.service.product_service.entity.ProductImages;
import com.product.service.product_service.repository.ProductImagesRepository;

@Service
public class ProductImagesService {

    @Autowired
    private ProductImagesRepository productImagesRepository;



    public List<ProductImages> getImagesByProductId(Long productId) {
        return productImagesRepository.findByProductId(productId);
    }

}
