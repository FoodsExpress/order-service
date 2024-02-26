package com.foodexpress.orderservice.common;

import com.foodexpress.orderservice.common.util.ApiUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.foodexpress.orderservice.common.util.ApiUtil.fail;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(BAD_REQUEST)
    public ApiUtil.ApiResult<Void> defaultException(Exception e) {
        return fail(e, BAD_REQUEST);
    }

}
