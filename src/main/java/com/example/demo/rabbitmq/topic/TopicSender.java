package com.example.demo.rabbitmq.topic;

import com.example.demo.rabbitmq.config.RabbitConfig;
import com.example.demo.rabbitmq.domain.UserRabbitmq;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Michael
 * @Date: Created in 17:52 2018/11/28
 * @Desciption:
 */
@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    // 第一个参数：TopicExchange名字
    // 第二个参数：Route-Key
    // 第三个参数：要发送的内容
    public void send(UserRabbitmq userRabbitmq) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.TOPIC_EXCHANGE,"lzc.message", userRabbitmq);
        this.rabbitTemplate.convertAndSend(RabbitConfig.TOPIC_EXCHANGE, "lzc.lzc", userRabbitmq);
    }
}
