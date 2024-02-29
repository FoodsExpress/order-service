package com.foodexpress.orderservice.application.port.in;

import lombok.Data;

@Data
public class RegisterCartMenuOptionDetailCommand {

    /**
     * 옵션 상세 식별자
     */
    private String optionDetailId;

    /**
     * 옵션 상세 명
     */
    private String optionDetailName;

    /**
     * 옵션 가격
     */
    private Long price;

}
