package com.alexandregomes.facade.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {
    @Id
    private String productId;
    private int stock;

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
