package com.foodexpress.orderservice.adapter.in.web;

import com.foodexpress.orderservice.application.port.in.RegisterCartCommand;
import lombok.Data;

import java.util.List;

@Data
public class RegisterCartRequest {

    /**
     * 상점 식별자
     */
    private String storeId;

    private List<RegisterCartMenuRequest> cartItems;

    public RegisterCartCommand mapToCommand() {
        RegisterCartCommand command = new RegisterCartCommand();
        command.setStoreId(storeId);
        command.setCartItems(this.cartItems.stream().map(RegisterCartMenuRequest::mapToCommand).toList());
        return command;
    }

}
