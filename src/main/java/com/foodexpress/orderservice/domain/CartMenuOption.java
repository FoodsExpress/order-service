package com.foodexpress.orderservice.domain;

import java.util.List;

public record CartMenuOption(
    // 메뉴 옵션 식별자
    String menuOptionId,
    // 메뉴 옵션 명
    String menuOptionName,
    // 메뉴 옵션 상세 목록 ( 선택된 옵션들 )
    List<CartMenuOptionDetail> cartMenuOptionDetails
) {

}
