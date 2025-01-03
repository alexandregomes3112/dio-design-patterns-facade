package com.alexandregomes.facade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alexandregomes.facade.facade.OrderFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderFacade orderFacade;

    @Operation(summary = "Fazer um pedido", description = "Permite realizar um pedido validando cliente, estoque e pagamento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Pedido realizado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro na validação do pedido")
    })
    @PostMapping("/place")
    public String placeOrder(
            @RequestParam String customerId,
            @RequestParam String productId,
            @RequestParam int quantity,
            @RequestParam double amount
    ) {
        boolean result = orderFacade.placeOrder(customerId, productId, quantity, amount);
        return result ? "Pedido realizado com sucesso!" : "Falha ao realizar o pedido.";
    }


}
