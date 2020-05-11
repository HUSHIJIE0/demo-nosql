package com.example.demo.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisKeyValueTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

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
    @Autowired
    RedisTemplate redisTemplate;


    //http://localhost:8080/redis/save

    /**
     *  保存方法
     * @return
     */
    @GetMapping(value = "save")
    public String save(@PathParam("key") String key, @PathParam("value") String value){
        redisService.setValue(key,value);
        return redisService.getValue(key).toString();
    }


}
