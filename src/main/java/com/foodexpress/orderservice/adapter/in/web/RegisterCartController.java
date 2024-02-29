package com.foodexpress.orderservice.adapter.in.web;

import com.foodexpress.orderservice.application.port.in.RegisterCartUseCase;
import com.foodexpress.orderservice.domain.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        List<Cart> registeredCart = registerCartUseCase.registerCart(request.mapToCommand());
    }

}
