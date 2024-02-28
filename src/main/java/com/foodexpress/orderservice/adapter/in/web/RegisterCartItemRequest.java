package com.foodexpress.orderservice.adapter.in.web;

import lombok.Data;

/**
 * 장바구니에 등록될 아이템
 *
 * @author seunggu.lee
 */
@Data
public class RegisterCartItemRequest {

    /**
     * 상품 식별자
     */
    private String catalogId;

    /**
     * 수량
     */
    private int quantity;

}
