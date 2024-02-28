package com.foodexpress.orderservice.adapter.in.web;

import lombok.Data;

import java.util.List;

/**
 * 장바구니에 등록될 아이템
 *
 * @author seunggu.lee
 */
@Data
public class RegisterCartItemOptionRequest {

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
    private List<RegisterCartItemOptionDetailRequest> optionDetails;

}
