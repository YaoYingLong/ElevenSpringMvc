package com.eleven.icode.imvc.controller;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by YingLong on 2021/10/10
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("GlobalExceptionHandler initBinder");
//        binder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }

    @ModelAttribute(value = "words")
    public String addAttributes() {
        System.out.println("GlobalExceptionHandler addAttributes");
        return "hello world";
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public String errorHanler(Exception e) {
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("code", 100);
        errorMap.put("msg", e.getMessage());
        return errorMap.toString();
    }
}
