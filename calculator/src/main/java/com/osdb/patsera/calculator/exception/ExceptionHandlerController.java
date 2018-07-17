package com.osdb.patsera.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handle() {
        return new ResponseEntity<>(new ErrorResponse(400, "Check parameters, please" ), HttpStatus.BAD_REQUEST);
    }
}
