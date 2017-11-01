package com.didispace.Business.interfaces;

import java.lang.annotation.*;

/**
 * Created by anson on 2017/10/18.
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface CheckAop {
}
