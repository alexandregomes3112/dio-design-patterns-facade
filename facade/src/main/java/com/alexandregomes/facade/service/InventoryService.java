package com.alexandregomes.facade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandregomes.facade.entity.Inventory;
import com.alexandregomes.facade.repository.InventoryRepository;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean checkStock(String productId, int quantity) {
        Inventory inventory = inventoryRepository.findById(productId).orElse(null);
        return inventory != null && inventory.getStock() >= quantity;
    }
}
