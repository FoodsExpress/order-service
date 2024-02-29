package com.foodexpress.orderservice.domain;

public record CartMenuOptionDetail(
    // 금액
    double price,
    // 옵션 상세 명칭
    String detailName
) {

}
