package com.foodexpress.orderservice.domain;

public enum CartStatus {
    // 정상
    ACTIVE,
    // 주문됨
    ORDERED,
    // 만료됨
    EXPIRED,
    // 삭제됨
    DELETED,
}
