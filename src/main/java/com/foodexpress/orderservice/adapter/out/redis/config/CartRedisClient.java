package com.foodexpress.orderservice.adapter.out.redis.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foodexpress.orderservice.domain.Cart;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class CartRedisClient {

    private final RedisTemplate<String, Object> redisTemplate;

    private static final ObjectMapper mapper = new ObjectMapper();

    public <T> Optional<T> get(Long key, Class<T> classType) {
        return get(key.toString(), classType);
    }

    private <T> Optional<T> get(String key, Class<T> classType) {

        String redisValue = (String)redisTemplate.opsForValue().get(key);

        if (ObjectUtils.isEmpty(redisValue)) {
            return Optional.empty();
        } else {
            try {
                return Optional.of(mapper.readValue(redisValue, classType));
            } catch (JsonProcessingException e) {
                log.error("Parsing error", e);
                return Optional.empty();
            }
        }
    }

    public void put(Long key, Cart cart) {
        put(key.toString(), cart);
    }

    private void put(String key, Cart cart) {
        try {
            redisTemplate.opsForValue().set(key, mapper.writeValueAsString(cart));
        } catch (JsonProcessingException e) {
            throw new RuntimeException("장바구니를 생성하는 도중 오류가 발생했습니다.");
        }
    }

}
