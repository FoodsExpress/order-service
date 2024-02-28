package com.foodexpress.orderservice.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 장바구니 등록 컨트롤러
 *
 * @author seunggu.lee
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/cart")
public class RegisterCartController {

    private final RegisterCartUseCase registerCartUseCase;

    @PostMapping
    public void registerCart(@RequestBody RegisterCartRequest request) {

    }

}
