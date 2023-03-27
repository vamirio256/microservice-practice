package com.microservicepractice.orderservice.service;

import com.microservicepractice.orderservice.dto.OrderRequest;

public interface OrderService {
    String placeOrder(OrderRequest orderRequest);
}
