package com.foodexpress.orderservice.adapter.in.web;

import com.foodexpress.orderservice.application.port.in.RegisterCartMenuOptionCommand;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * 장바구니에 등록될 아이템
 *
 * @author seunggu.lee
 */
@Data
public class RegisterCartMenuOptionRequest {

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
    private List<RegisterCartMenuOptionDetailRequest> optionDetails = new ArrayList<>();

    public RegisterCartMenuOptionCommand mapToCommand() {
        RegisterCartMenuOptionCommand command = new RegisterCartMenuOptionCommand();
        copyProperties(this, command);
        if (!this.optionDetails.isEmpty()) {
            command.setOptionDetails(this.optionDetails.stream().map(RegisterCartMenuOptionDetailRequest::mapToCommand).toList());
        }
        return command;
    }

}
