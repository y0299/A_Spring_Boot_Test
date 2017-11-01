package com.didispace.Business.configuration;

import com.didispace.Business.Module.CalcScore;
import com.didispace.Business.Service.CalcScoreImpl;
import com.didispace.Business.Service.CalcScoreSecondImpl;
import com.didispace.Business.Service.CustomAspect;
import com.didispace.Business.filters.CustomEtgHeaderFilter;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by anson on 2017/10/18.
 */
@ComponentScan
@Configuration
public class AutoConfig {
    @Bean
    public CustomAspect getCustomAspect() {
        return new CustomAspect();
    }

    @Bean(name = "calcScore")
    public CalcScore getCalcScore() {
        return new CalcScoreImpl();
    }

    @Bean(name = "calcSecond")
    public CalcScore getCalcScoreSecond() {
        return new CalcScoreSecondImpl();
    }

    @Bean
    public CustomEtgHeaderFilter getCustomEtgHeaderFilter() {
        return new CustomEtgHeaderFilter();
    }

    @Bean
    public FilterRegistrationBean filterRegistryBean() {
        FilterRegistrationBean filter = new FilterRegistrationBean();
        filter.setFilter(null);
        filter.setName("CustomFilter");
        return filter;
    }
}
