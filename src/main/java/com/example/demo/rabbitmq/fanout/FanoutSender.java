package com.example.demo.rabbitmq.fanout;

import com.example.demo.rabbitmq.config.RabbitConfig;
import com.example.demo.rabbitmq.domain.UserRabbitmq;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Michael
 * @Date: Created in 17:44 2018/11/28
 * @Desciption:
 */

@Component
public class FanoutSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(UserRabbitmq user) {
        this.rabbitTemplate.convertAndSend(RabbitConfig.FANOUT_EXCHANGE, "", user);
    }

}
