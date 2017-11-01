package com.didispace.Business.interceptors;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by anson on 2017/10/25.
 */
@Configuration
public class CustomMvcConfigure extends WebMvcConfigurerAdapter{

    @Bean(name = "getCustomInterceptor")
    public CustomInterceptor getCustomInterceptor() {
        return new CustomInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getCustomInterceptor());
        super.addInterceptors(registry);
    }
}
