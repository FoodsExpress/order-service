package com.foodexpress.orderservice.adapter.in.web;

import com.foodexpress.orderservice.application.port.in.RegisterCartMenuOptionDetailCommand;
import lombok.Data;

import static org.springframework.beans.BeanUtils.copyProperties;

@Data
public class RegisterCartMenuOptionDetailRequest {

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

    public RegisterCartMenuOptionDetailCommand mapToCommand() {
        RegisterCartMenuOptionDetailCommand command = new RegisterCartMenuOptionDetailCommand();
        copyProperties(this, command);
        return command;
    }

}
