package com.example.trips;

import org.springframework.http.HttpStatus;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class MyControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ErrorMessage somethingWentWrong(Exception e, WebRequest request) {
        return new ErrorMessage(e.getCause());
    }

}
