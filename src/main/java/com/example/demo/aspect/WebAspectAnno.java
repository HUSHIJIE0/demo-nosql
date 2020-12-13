package com.example.demo.aspect;

import com.example.demo.aspect.annotationaspect.WebDesc;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: Michael
 * @Date: Created in 10:21 2018/11/28
 * @Desciption:
 */
@Component
@Aspect
public class WebAspectAnno {
    private final static Logger LOGGER = LoggerFactory.getLogger(WebAspectAnno.class);
    /**
     * 切入点
     * 用注解
     */
    @Pointcut("@annotation(com.example.demo.aspect.annotationaspect.WebDesc)")
    public void executeAnnotation(){
    }
    @Before("executeAnnotation()")
    public void beforeAdviceAnnotation(){
        LOGGER.info("- - - - - 前置通知 annotation - - - - -");
    }
    @Around("@annotation(webDesc)")
    public Object aroundAnnotation(ProceedingJoinPoint proceedingJoinPoint, WebDesc webDesc){
        LOGGER.info("- - - - - 环绕通知 annotation - - - -");
        //获取注解里的值
        LOGGER.info("注解的值:" + webDesc.describe());
        try {//obj之前可以写目标方法执行前的逻辑
            Object obj = proceedingJoinPoint.proceed();//调用执行目标方法
            LOGGER.info("- - - - - 环绕通知 annotation end - - - -");
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
