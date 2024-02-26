package com.foodexpress.orderservice.common.security;

public record JwtAuthentication(Long id, String accountId, String email, String nickname) {

}