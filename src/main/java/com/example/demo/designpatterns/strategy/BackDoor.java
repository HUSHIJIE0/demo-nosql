package com.example.demo.designpatterns.strategy;

/**
 * @program: demo
 * @description: 找乔国老帮忙，使孙权不能杀刘备
 * @author: Michael
 * @create: 2019-04-21 21:35
 */
public class BackDoor implements Istrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
