package com.example.demo.rabbitmq.topic;

import com.example.demo.rabbitmq.config.RabbitConfig;
import com.example.demo.rabbitmq.domain.UserRabbitmq;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Michael
 * @Date: Created in 17:52 2018/11/28
 * @Desciption:
 */
@Component
public class TopicReceiver {
    // queues是指要监听的队列的名字
    @RabbitListener(queues = RabbitConfig.TOPIC_QUEUE1)
    public void receiveTopic1(UserRabbitmq userRabbitmq) {
        System.out.println("【receiveTopic1监听到消息】" + userRabbitmq.toString());
    }
    @RabbitListener(queues = RabbitConfig.TOPIC_QUEUE2)
    public void receiveTopic2(UserRabbitmq userRabbitmq) {
        System.out.println("【receiveTopic2监听到消息】" + userRabbitmq.toString());
    }
}
