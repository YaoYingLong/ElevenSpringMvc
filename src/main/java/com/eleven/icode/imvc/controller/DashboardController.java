package com.eleven.icode.imvc.controller;

import com.eleven.icode.imvc.service.DashboardService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author by YingLong on 2021/10/2
 */
@Controller
@RequestMapping(value = "/test")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @RequestMapping(value = "/hello")
    public String hello(@ModelAttribute(name = "words") String words) {
        System.out.println("hello SpringMvc，words：" + words);
        dashboardService.getUserInfo();
        return "a";
    }

    @RequestMapping(value = "/error")
    public String error(@ModelAttribute(name = "words") String words) {
        System.out.println("hello SpringMvc，words：" + words);
        throw new IllegalArgumentException(words);
    }

    @ResponseBody
    @RequestMapping(value = "/date")
    public Date date(@RequestParam(name = "date") Date date) {
        System.out.println("hello SpringMvc，date：" + date);
        return date;
    }

    @ResponseBody
    @RequestMapping(value = "/date1")
    public Date date1(@RequestParam(name = "date1") Date date1) {
        System.out.println("hello SpringMvc，date：" + date1);
        return date1;
    }
}
