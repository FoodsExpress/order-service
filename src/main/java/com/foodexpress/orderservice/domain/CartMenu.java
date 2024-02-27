package com.foodexpress.orderservice.domain;

public record CartMenu(
    // 컬렉션의 각 줄 항목은 고유 줄 번호(0에서 1까지 셈)를 가져옵니다.
    int lineItemNumber,
    String menuId,
    // 메뉴 명
    String menuName,
    // 수량
    int quantity
) {

}
