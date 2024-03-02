package com.foodexpress.orderservice.application.port.in;

import com.foodexpress.orderservice.domain.Cart;
import lombok.Data;

import java.util.List;

@Data
public class RegisterCartMenuCommand {

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
    private List<RegisterCartMenuOptionCommand> menuOptions;

    public Cart mapToDomain() {
        return Cart.builder().build();
    }

}
