package com.didispace.web;

import com.didispace.Business.Module.CalcScore;
import com.didispace.Business.Service.CalcScoreImpl;
import com.didispace.Business.Service.ProcessInvokeHandler;
import com.didispace.Business.interfaces.CheckAop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;

@RestController
public class HelloController {
//    @Autowired
//    private CalcScoreImpl calcScore;
    @Autowired
    @Qualifier(value = "calcSecond")
    private CalcScore calcScoreIf;

    @RequestMapping("/hello")
    public String index() {
//        ProcessInvokeHandler handler = new ProcessInvokeHandler(new CalcScoreImpl());
//        CalcScore calcScore = (CalcScore) Proxy.newProxyInstance(CalcScore.class.getClassLoader(),
//                                                                new Class[]{CalcScore.class},
//                                                                handler);
//        calcScore.calcScore(100);
//        CalcScoreImpl calcImpl = new CalcScoreImpl();
        calcScoreIf.calcScore(100);
        return "Hello World";
    }

}