package com.example.demo.designpatterns.factorymethod;

/**
 * @program: demo
 * @description: 黑色人类，记得中学学英语，老师说black man是侮辱人的意思，不懂，没跟老外说话
 * @author: Michael
 * @create: 2019-04-22 21:51
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人会哭");
    }

    @Override
    public void cry() {
        System.out.println("黑人会笑");
    }

    @Override
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}