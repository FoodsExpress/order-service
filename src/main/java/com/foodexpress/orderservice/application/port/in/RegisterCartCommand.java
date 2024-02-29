package com.foodexpress.orderservice.application.port.in;

import lombok.Data;

import java.util.List;

@Data
public class RegisterCartCommand {

    /**
     * 상점 식별자
     */
    private String storeId;

    /**
     * 메뉴 목록
     */
    private List<RegisterCartMenuCommand> cartItems;

}
