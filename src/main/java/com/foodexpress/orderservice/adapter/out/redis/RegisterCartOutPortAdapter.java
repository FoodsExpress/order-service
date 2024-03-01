package com.foodexpress.orderservice.adapter.out.redis;

import com.foodexpress.orderservice.application.port.out.RegisterCartOutPort;
import com.foodexpress.orderservice.common.RedisAdapter;
import com.foodexpress.orderservice.domain.Cart;

import java.util.List;

@RedisAdapter
public class RegisterCartOutPortAdapter implements RegisterCartOutPort {

    @Override
    public List<Cart> saveCart(List<Cart> carts, String accountId) {
        return null;
    }

}
