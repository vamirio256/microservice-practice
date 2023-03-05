package com.microservicepractice.inventoryservice.service;

import com.microservicepractice.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {
    List<InventoryResponse> isInStock(List<String> skuCode);
}
