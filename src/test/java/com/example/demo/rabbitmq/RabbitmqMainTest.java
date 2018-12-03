package com.example.demo.rabbitmq;

import com.example.demo.DemoApplicationTests;
import com.example.demo.rabbitmq.direct.DirectSender;
import com.example.demo.rabbitmq.domain.UserRabbitmq;
import com.example.demo.rabbitmq.fanout.FanoutSender;
import com.example.demo.rabbitmq.topic.TopicSender;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Michael
 * @Date: Created in 15:40 2018/11/30
 * @Desciption:
 */
public class RabbitmqMainTest extends DemoApplicationTests {
    @Autowired
    private FanoutSender fanoutSender;
    @Autowired
    private TopicSender topicSender;
    @Autowired
    private DirectSender directSender;

    @Test
    public void contextLoads() {
    }


    /**
     * TOPIC测试
     * @throws Exception
     */
    @Test
    public void testTopic() throws Exception {
        UserRabbitmq user=new UserRabbitmq();
        user.setId("1");
        user.setName("TOPIC测试");
        topicSender.send(user);
    }

    /**
     * Fanout测试
     * @throws Exception
     */
    @Test
    public void testFanout() throws Exception {
        UserRabbitmq user=new UserRabbitmq();
        user.setId("1");
        user.setName("Fanout测试");
        fanoutSender.send(user);
    }

    /**
     * DIRECT测试
     * @throws Exception
     */
    @Test
    public void testDirect() throws Exception {
        UserRabbitmq user=new UserRabbitmq();
        user.setId("1");
        user.setName("DIRECT测试");
        directSender.send(user);
    }
}