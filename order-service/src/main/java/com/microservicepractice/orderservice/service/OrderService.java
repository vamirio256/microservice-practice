package com.microservicepractice.orderservice.service;

import com.microservicepractice.orderservice.dto.OrderRequest;

public interface OrderService {
    void placeOrder(OrderRequest orderRequest);
}
