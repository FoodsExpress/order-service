package com.foodexpress.orderservice.domain;

public record OrderLineItem(
    // 컬렉션의 각 줄 항목은 고유 줄 번호(0에서 1까지 셈)를 가져옵니다.
    int lineItemNumber,
    // 상품 식별자
    String catalogId,
    // 아이템 명
    String itemName,
    // 수량
    int quantity
) {

}
