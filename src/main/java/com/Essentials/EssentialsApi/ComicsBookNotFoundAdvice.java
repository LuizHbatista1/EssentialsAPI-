package com.Essentials.EssentialsApi;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//These class work with WebExceptions

@ControllerAdvice

class ComicsBookNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ComicsBookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ComicsBookNotFoundHandler(ComicsBookNotFoundException ex) {
        return ex.getMessage();
    }
}