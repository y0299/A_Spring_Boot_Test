package com.didispace.Business.Service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by anson on 2017/10/18.
 */
@Aspect
@Slf4j
public class CustomAspect {
    @Pointcut("@annotation(com.didispace.Business.interfaces.CheckAop) || within(com.didispace.Business.interfaces.CheckAop)")
    public void checkRole(){}

    @Pointcut("execution(* com.didispace.Business.Service.CalcScoreImpl.calcScore( .. ))")
    public void modifyScore(){}

    @Before("checkRole()")
    public void preProcess() {
        log.info("this is one of point-cut belongs CustomAspect Before!");
    }

    @After("checkRole()")
    public void postProcess() {
        log.info("this is one of point-cut belongs CustomAspect After!");
    }

    @Around("modifyScore()")
    public void preProcessScore(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("modify Score : this is one of point-cut belongs CustomAspect around!");
        joinPoint.proceed();
    }
}
