package com.foodexpress.orderservice.application.service;

import com.foodexpress.orderservice.application.port.in.RegisterCartCommand;
import com.foodexpress.orderservice.application.port.in.RegisterCartUseCase;
import com.foodexpress.orderservice.common.UseCase;
import com.foodexpress.orderservice.domain.Cart;
import lombok.RequiredArgsConstructor;

import java.util.List;

@UseCase
@RequiredArgsConstructor
public class RegisterCartService implements RegisterCartUseCase {

    @Override
    public List<Cart> registerCart(RegisterCartCommand registerCartCommand) {
        return null;
    }

}
