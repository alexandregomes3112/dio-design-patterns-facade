package com.alexandregomes.facade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandregomes.facade.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}