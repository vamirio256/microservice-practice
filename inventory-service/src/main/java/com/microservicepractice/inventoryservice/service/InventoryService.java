package com.microservicepractice.inventoryservice.service;

public interface InventoryService {
    boolean isInStock(String skuCode);
}
