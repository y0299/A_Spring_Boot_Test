package com.didispace.Business.configuration;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by anson on 2017/10/27.
 */
@Component
public class DruidAutoConifg {
    @Bean
    public ServletRegistrationBean druidServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setServlet(new HttpRequestHandlerServlet());
        registrationBean.addUrlMappings("/xx/*");
        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("allow", "");  // IP白名单 (没有配置或者为空，则允许所有访问)
//        paramMap.put("deny", "127.0.0.1:8080");// IP黑名单 (存在共同时，deny优先于allow)
        registrationBean.setInitParameters(paramMap);
        return registrationBean;
    }
}
