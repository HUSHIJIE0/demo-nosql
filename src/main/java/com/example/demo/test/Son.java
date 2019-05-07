package com.example.demo.test;

/**
 * @program: demo
 * @description: 子类
 * @author: Michael
 * @create: 2019-04-23 00:33
 */
public class Son extends Father {

    @Override
    public void eat() {
        super.eat();
        System.out.println("I Can Eat too");
    }

    @Override
    public void talk() {
        System.out.println("I Can Talk too");
        super.talk();
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.eat();
        son.talk();
    }
}
