package com.eleven.icode.imvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by YingLong on 2021/10/7
 */
@Controller
public class RequestController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "a";
    }
}
