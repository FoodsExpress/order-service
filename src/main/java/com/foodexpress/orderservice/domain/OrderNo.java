package com.foodexpress.orderservice.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class OrderNo {

    private String number;

    public static OrderNo of(String number) {
        return new OrderNo(number);
    }

}
