package com.foodexpress.orderservice.application.port.in;

import com.foodexpress.orderservice.domain.Cart;

import java.util.List;

public interface RegisterCartUseCase {

    List<Cart> registerCart(RegisterCartCommand registerCartCommand, String accountId);

}
