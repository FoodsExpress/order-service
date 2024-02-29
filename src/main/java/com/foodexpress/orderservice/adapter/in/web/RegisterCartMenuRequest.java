package com.foodexpress.orderservice.adapter.in.web;

import com.foodexpress.orderservice.application.port.in.RegisterCartMenuCommand;
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
public class RegisterCartMenuRequest {

    /**
     * 상품 식별자
     */
    private String menuId;

    /**
     * 수량
     */
    private int quantity;

    /**
     * 메뉴 옵션 목록
     */
    private List<RegisterCartMenuOptionRequest> menuOptions = new ArrayList<>();

    public RegisterCartMenuCommand mapToCommand() {
        RegisterCartMenuCommand command = new RegisterCartMenuCommand();
        copyProperties(this, command);
        if (!menuOptions.isEmpty()) {
            command.setMenuOptions(menuOptions.stream().map(RegisterCartMenuOptionRequest::mapToCommand).toList());
        }
        return command;
    }

}
