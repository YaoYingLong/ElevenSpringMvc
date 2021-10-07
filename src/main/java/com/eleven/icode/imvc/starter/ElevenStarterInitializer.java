package com.eleven.icode.imvc.starter;

import com.eleven.icode.imvc.config.RootConfig;
import com.eleven.icode.imvc.config.WebAppConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 在tomcat源码中:
 * org.apache.catalina.startup.ContextConfig#lifecycleEvent(org.apache.catalina.LifecycleEvent
 * org.apache.catalina.startup.ContextConfig#configureStart
 * org.apache.catalina.startup.ContextConfig#webConfig
 * org.apache.catalina.startup.ContextConfig#processServletContainerInitializers
 * <p>
 * //通过spi的机制加载 classpath下ServletContainerInitializer
 * WebappServiceLoader<ServletContainerInitializer> loader = new WebappServiceLoader<>(context);
 * detectedScis = loader.load(ServletContainerInitializer.class);
 * <p>
 * Created by xsls on 2019/7/31.
 */

public class ElevenStarterInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
