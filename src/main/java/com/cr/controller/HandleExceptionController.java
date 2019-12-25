package com.cr.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExceptionController {

    @ExceptionHandler(Exception.class)
    public String exception(){
        return "error";
    }

}
