package com.eleven.icode.imvc.controller;

import com.eleven.icode.imvc.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author by YingLong on 2021/10/2
 */
@Controller
@RequestMapping(value = "/test")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @RequestMapping(value = "/hello")
    public String hello() {
        System.out.println("hello SpringMvc");
        dashboardService.getUserInfo();
        return "a";
    }
}
