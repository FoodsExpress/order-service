package com.foodexpress.orderservice.application.port.out;

import com.foodexpress.orderservice.domain.Cart;

import java.util.List;

public interface RegisterCartOutPort {

    List<Cart> saveCart(List<Cart> carts, String accountId);

}
