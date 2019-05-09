package com.example.demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: demo
 * @description: kafka消费者
 * @author: Michael
 * @create: 2019-05-08 09:57
 */
@Component
public class KafkaConsumerService {
    @Autowired
    private SplitService splitService;

    @KafkaListener(topics = "${spring.kafka.topics.test}", containerFactory = "kafkaListenerContainerFactory")
    public void processMessage(List<ConsumerRecord<?, ?>> records) {

        for (ConsumerRecord<?, ?> record : records) {
            String message = (String) record.value();
            splitService.saveAndSplitLog(message);
        }
    }
}
