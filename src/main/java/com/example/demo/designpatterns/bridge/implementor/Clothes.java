package com.example.demo.designpatterns.bridge.implementor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/02/20:41
 * @Description: 我集团公司生产的衣服
 */
public class Clothes extends Product {

    //豆腐渣就豆腐渣呗，好歹也是个房子
    public void beProducted() {
        System.out.println("生产出的衣服是这个样子的...");
    }
    //虽然是豆腐渣，也是能够销售出去的
    public void beSelled() {
        System.out.println("生产出的衣服卖出去了...");
    }
}
