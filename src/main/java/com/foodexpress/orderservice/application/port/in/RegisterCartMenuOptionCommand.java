package com.foodexpress.orderservice.application.port.in;

import lombok.Data;

import java.util.List;

@Data
public class RegisterCartMenuOptionCommand {

    /**
     * 상품 식별자
     */
    private String optionId;

    /**
     * 옵션 명
     */
    private String optionName;

    /**
     * 옵션 상세 목록
     */
    private List<RegisterCartMenuOptionDetailCommand> optionDetails;

}
