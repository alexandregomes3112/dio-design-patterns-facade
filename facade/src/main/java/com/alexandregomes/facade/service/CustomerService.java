package com.alexandregomes.facade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexandregomes.facade.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public boolean validateCustomer(String customerId) {
        return customerRepository.existsById(customerId);
    }
}
