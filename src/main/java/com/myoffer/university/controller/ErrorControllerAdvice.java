package com.myoffer.university.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.HandlerMethod;

@ControllerAdvice
public class ErrorControllerAdvice  {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e, HandlerMethod method, Model modle) {
        System.out.println("统一异常处理!");
        System.out.println(e.getMessage());
        return "error";
    }
}
