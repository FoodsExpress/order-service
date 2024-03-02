package com.foodexpress.orderservice.domain;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record Cart(
    // 장바구니 식별자
    Long id,
    // 주문 번호
    String cartId,
    // 상점 식별자
    String storeId,
    // 고객 식별자
    String customerId,
    // 장바구니 상태
    CartStatus cartStatus,
    // 고객이 구매하는 제품의 항목별 목록
    List<CartMenu> cartMenus,
    // 장바구니 생성 시각
    LocalDateTime createdAt,
    // 마지막 수정 시각
    LocalDateTime lastModifiedAt,
    // 장바구니가 만료되는 시각
    LocalDateTime expirationAt
) {

}
