package com.microservicepractice.productservice.service;

import com.microservicepractice.productservice.dto.ProductRequest;
import com.microservicepractice.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
