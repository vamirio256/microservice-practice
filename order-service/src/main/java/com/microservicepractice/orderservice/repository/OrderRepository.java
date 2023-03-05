package com.microservicepractice.orderservice.repository;

import com.microservicepractice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
