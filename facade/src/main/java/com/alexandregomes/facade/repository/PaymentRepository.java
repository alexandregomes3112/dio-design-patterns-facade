package com.alexandregomes.facade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandregomes.facade.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}