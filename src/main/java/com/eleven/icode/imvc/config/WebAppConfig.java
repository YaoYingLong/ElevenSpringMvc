package com.eleven.icode.imvc.config;

import com.eleven.icode.imvc.interceptor.ElevenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.eleven.icode.imvc"}, includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {RestController.class, Controller.class})
}, useDefaultFilters = false)
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

    /**
     * 配置拦截器
     */
    @Bean
    public ElevenInterceptor elevenInterceptor() {
        return new ElevenInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(elevenInterceptor()).addPathPatterns("/*");
    }

    /**
     * 方法实现说明:配置试图解析器
     *
     * @author:xsls
     * @exception:
     * @date:2019/8/6 16:23
     */
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/");
        return viewResolver;
    }
}
