package com.didispace.Business.Service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by anson on 2017/10/17.
 */
@Component
@NoArgsConstructor
public class ProcessInvokeHandler implements InvocationHandler{
    private Object target;

    public ProcessInvokeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target, args);
        return result;
    }
}
