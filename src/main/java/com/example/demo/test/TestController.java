package com.example.demo.test;

import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping(path = "/test")
public class TestController {

    @GetMapping("/test1")
    public Object test1(){
        AtomicInteger at = new AtomicInteger();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(() -> {
                for (int i1 = 0; i1 < 10; i1++) {
                    System.out.println(at.incrementAndGet());
                }
            });
            threads[i].start();
        }

        return "Hello World";
    }
}
