package com.example.demo.rabbitmq.direct;

import com.example.demo.rabbitmq.config.RabbitConfig;
import com.example.demo.rabbitmq.domain.UserRabbitmq;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Michael
 * @Date: Created in 17:51 2018/11/28
 * @Desciption:
 */
@Component
public class DirectReceiver {
    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitConfig.DIRECT_QUEUE1)
    public void receiveDirect1(UserRabbitmq userRabbitmq) {

        System.out.println("【receiveDirect1监听到消息】" + userRabbitmq);
    }

    @RabbitListener(queues = RabbitConfig.DIRECT_QUEUE2)
    public void receiveDirect2(UserRabbitmq userRabbitmq) {

        System.out.println("【receiveDirect2监听到消息】" + userRabbitmq);
    }
}
