package com.example.demo.designpatterns.strategy;

/**
 * @program: demo
 * @description: 孙夫人断后，挡住追兵
 * @author: Michael
 * @create: 2019-04-21 21:46
 */
public class BlockEnemy implements Istrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");

    }
}
