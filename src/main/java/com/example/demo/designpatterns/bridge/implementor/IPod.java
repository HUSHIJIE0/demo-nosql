package com.example.demo.designpatterns.bridge.implementor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/02/20:41
 * @Description: 生产iPod了
 */
public class IPod extends Product {

    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的...");
    }

    public void beSelled() {
        System.out.println("生产出的iPod卖出去了...");
    }
}
