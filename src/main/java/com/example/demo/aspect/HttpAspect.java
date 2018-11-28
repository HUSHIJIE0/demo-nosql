package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);
    /*1）execution(* *(..))
    //表示匹配所有方法
    // 2）execution(public * com. example.controller.*(..))
    //表示匹配com. example.controller中所有的public方法
    // 3）execution(* com. example.controller..*.*(..))
    //表示匹配com. example.controller包及其子包下的所有方法*/

    @Pointcut("execution(public * com.example.demo.mybatis.UserMybatisController.*(..))")//切面所切的位置
    public void log(){
    }

    @Before("log()")//请求之前
    public void before(JoinPoint joinPoint){
//        System.out.println("this is the aspect before every requset!!!!");
        LOGGER.info("this is the aspect before every requset!!!!");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url
        LOGGER.info("url={}",request.getRequestURL());
        //method
        LOGGER.info("method={}",request.getMethod());
        //ip
        LOGGER.info("id={}",request.getRemoteAddr());
        //class_method
        LOGGER.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName() + "," + joinPoint.getSignature().getName());
        //args[]
        LOGGER.info("args={}",joinPoint.getArgs());
    }

    @After("log()")//请求之后
    public void after(){
        LOGGER.info("this is the aspect after every response!!!");
    }

    @AfterReturning(pointcut = "log()",returning = "object")//打印输出结果
    public void doAfterReturing(Object object){
        LOGGER.info("response={}",object);
    }
}