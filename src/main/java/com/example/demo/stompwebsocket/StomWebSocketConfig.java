package com.example.demo.stompwebsocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class StomWebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //客户端订阅消息的请求前缀，topic一般用于广播推送，queue用于点对点推送
        config.enableSimpleBroker("/topic", "/queue");
        //客户端发送消息的请求前缀
        config.setApplicationDestinationPrefixes("/app");
        //服务端通知客户端的前缀，可以不设置，默认为user
        config.setUserDestinationPrefix("/user");

        /*	如果是用自己的消息中间件，则按照下面的去配置，删除上面的配置
		 *	 registry.enableStompBrokerRelay("/topic", "/queue")
			.setRelayHost("rabbit.someotherserver")
			.setRelayPort(62623)
			.setClientLogin("marcopolo")
			.setClientPasscode("letmein01");
			registry.setApplicationDestinationPrefixes("/app", "/foo");
		 * */
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // 如果需要跨域，在addEndpoint后面调用 setAllowedOrigins("*")
        registry.addEndpoint("/gs-guide-websocket").withSockJS();
    }


}