package com.example.productserviceaws.exceptionhandlers;

import com.example.productserviceaws.dtos.ProductNotFoundExceptionDto;
import com.example.productserviceaws.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ProductNotFoundException.class)
    ResponseEntity<ProductNotFoundExceptionDto> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
        ProductNotFoundExceptionDto productNotFoundExceptionDto = new ProductNotFoundExceptionDto();
        productNotFoundExceptionDto.setErrorCode(productNotFoundException.getErrorCode());
        productNotFoundExceptionDto.setErrorMessage(productNotFoundException.getMessage());
        return new ResponseEntity<>(productNotFoundExceptionDto, HttpStatus.NOT_FOUND);
    }


    @org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
    ResponseEntity<ProductNotFoundExceptionDto> handleNullException(ProductNotFoundException productNotFoundException) {
        ProductNotFoundExceptionDto productNotFoundExceptionDto = new ProductNotFoundExceptionDto();
        productNotFoundExceptionDto.setErrorCode(productNotFoundException.getErrorCode());
        productNotFoundExceptionDto.setErrorMessage(productNotFoundException.getMessage());
        return new ResponseEntity<>(productNotFoundExceptionDto, HttpStatus.NOT_FOUND);
    }

}
