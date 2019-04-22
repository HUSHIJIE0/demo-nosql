package com.example.demo.designpatterns.singleton;

/**
 * @program: demo
 * @description: 通用单例模式-- 线程安全
 * @author: Michael
 * @create: 2019-04-22 00:19
 */
public class SingletonPattern {
    private static final SingletonPattern singletonPattern = new SingletonPattern();

    //限制住不能直接产生一个实例
    private SingletonPattern() {
    }

    public synchronized static SingletonPattern getInstance() {
        return singletonPattern;
    }

}
