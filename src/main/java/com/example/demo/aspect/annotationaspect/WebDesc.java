package com.example.demo.aspect.annotationaspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Michael
 * @Date: Created in 10:20 2018/11/28
 * @Desciption:
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface WebDesc {
    String describe() default "mydesc";
}
