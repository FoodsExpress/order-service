package com.foodexpress.orderservice.domain;

import java.time.LocalDateTime;
import java.util.List;

public record Order(
    // 주문 식별자
    Long id,
    // 주문 번호
    OrderNo orderNo,
    // 장바구니 식별자
    String cartId,
    // 상점 식별자
    String storeId,
    // 고객 식별자
    String customerId,
    // 고객이 구매하는 제품의 항목별 목록
    List<OrderLineItem> orderLineItems,
    // 주문 상태
    OrderStatus orderStatus,
    // 주문 시각
    LocalDateTime orderedAt
) {

}
