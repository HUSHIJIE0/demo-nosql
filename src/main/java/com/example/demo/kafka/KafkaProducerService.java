package com.example.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

/**
 * @program: demo
 * @description: kafka生产者
 * @author: Michael
 * @create: 2019-05-09 11:35
 */
@Component
@EnableScheduling
public class KafkaProducerService {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 定时任务
     */
    @Scheduled(cron = "0 0/1 * * * ?")
    public void send(){
        String message = "{\"message\":\""+UUID.randomUUID().toString()+"\"}";
        ListenableFuture future = kafkaTemplate.send("nginx_log", message);
        future.addCallback(o -> System.out.println("send-消息发送成功：" + message), throwable -> System.out.println("消息发送失败：" + message));
    }
}
