package com.alexandregomes.facade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandregomes.facade.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}