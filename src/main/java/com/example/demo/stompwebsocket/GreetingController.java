package com.example.demo.stompwebsocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.security.Principal;

@Slf4j
@Controller
public class GreetingController {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message, Principal principal) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

    /**
     * 收到消息并推送给 所有人
     *
     * @param message 浏览器端发送的参数
     * @return 浏览器端接收的内容
     */
    @MessageMapping("/sendSub")
    @SendTo("/topic/sub")
    public Greeting testReceiveAndTopicSend(HelloMessage message, Principal principal) {
        log.debug("{} 收到消息: {}", "testReceiveAndTopicSend", message);
        return new Greeting("Hello To All, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

    /**
     *
     * Tips：SimpMessagingTemplate这个bean是当你的配置生效后，spring自动注入的bean，直接用就可以了。
     * 它可以实现注解@sendto或者@sendtoUser的所有功能，并且可以在任意地方使用(sendto系列注解必须要在controller中陪着MassageMapp使用)，
     * 用它就可以实现后台的主动推送消息。当然sendto也有它的好处，比如直接将你得pojo转json字符串发到对于的消费者那里。
     */
    @MessageMapping("/send")
    public void subscription(HelloMessage message, Principal principal) {
        simpMessagingTemplate.convertAndSend("/topic/sub",new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!"));
    }

    //广播推送消息
    @Scheduled(fixedRate = 10000)
    public void sendTopicMessage() {
        log.info("后台广播推送！");
        simpMessagingTemplate.convertAndSend("/topic/sub", new Greeting("Hello, " + HtmlUtils.htmlEscape("HERO") + "!"));
    }


}
