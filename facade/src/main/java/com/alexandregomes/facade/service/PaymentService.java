package com.alexandregomes.facade.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandregomes.facade.entity.Payment;
import com.alexandregomes.facade.repository.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public boolean processPayment(String customerId, double amount) {
        Payment payment = new Payment();
        payment.setPaymentId(UUID.randomUUID().toString());
        payment.setCustomerId(customerId);
        payment.setAmount(amount);
        paymentRepository.save(payment);
        return true;
    }
}