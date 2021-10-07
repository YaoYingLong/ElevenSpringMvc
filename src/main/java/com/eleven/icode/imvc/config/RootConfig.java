package com.eleven.icode.imvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

@Configuration
@ComponentScan(basePackages = "com.eleven.icode.imvc", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {RestController.class, Controller.class}),
        @ComponentScan.Filter(type = ASSIGNABLE_TYPE, value = WebAppConfig.class),
})
public class RootConfig {
}
