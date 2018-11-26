package com.example.demo.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Michael
 * @Date: Created in 10:30 2018/11/21
 * @Desciption:
 */
@RestController
@RequestMapping(value="redis")
public class RedisController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    RedisService redisService;


    //http://localhost:8888/redis/save
    @GetMapping("save")
    public String save(){
        redisService.setValue("key","hello");
        return "success";
    }


}
