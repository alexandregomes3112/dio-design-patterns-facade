package com.alexandregomes.facade.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alexandregomes.facade.service.CustomerService;
import com.alexandregomes.facade.service.InventoryService;
import com.alexandregomes.facade.service.PaymentService;

@Component
public class OrderFacade {
     @Autowired
    private CustomerService customerService;

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private PaymentService paymentService;

    public boolean placeOrder(String customerId, String productId, int quantity, double amount) {
        if (!customerService.validateCustomer(customerId)) {
            System.out.println("Cliente inválido.");
            return false;
        }
        if (!inventoryService.checkStock(productId, quantity)) {
            System.out.println("Estoque insuficiente.");
            return false;
        }
        if (!paymentService.processPayment(customerId, amount)) {
            System.out.println("Falha no pagamento.");
            return false;
        }
        System.out.println("Pedido realizado com sucesso!");
        return true;
    }

}
