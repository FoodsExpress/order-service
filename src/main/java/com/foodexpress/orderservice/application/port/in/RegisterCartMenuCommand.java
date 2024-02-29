package com.foodexpress.orderservice.application.port.in;

import lombok.Data;

import java.util.List;

@Data
public class RegisterCartMenuCommand {

    /**
     * 상품 식별자
     */
    private String catalogId;

    /**
     * 수량
     */
    private int quantity;

    /**
     * 메뉴 옵션 목록
     */
    private List<RegisterCartMenuOptionCommand> menuOptions;

}
