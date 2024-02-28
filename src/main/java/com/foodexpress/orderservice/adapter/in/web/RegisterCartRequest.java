package com.foodexpress.orderservice.adapter.in.web;

import lombok.Data;

@Data
public class RegisterCartRequest {

    /**
     * 상점 식별자
     */
    private String storeId;

    private List<RegisterCartItemRequest> cartItems;

}
