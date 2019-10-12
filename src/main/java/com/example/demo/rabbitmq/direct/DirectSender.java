package com.example.demo.rabbitmq.direct;

import com.example.demo.rabbitmq.config.RabbitConfig;
import com.example.demo.rabbitmq.domain.UserRabbitmq;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Michael
 * @Date: Created in 17:49 2018/11/28
 * @Desciption:
 */
@Component
public class DirectSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(UserRabbitmq userRabbitmq) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.DIRECT_EXCHANGE, "direct.pwl", userRabbitmq);
    }
}
