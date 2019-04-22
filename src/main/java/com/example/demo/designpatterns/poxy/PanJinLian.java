package com.example.demo.designpatterns.poxy;

/**
 * @program: demo
 * @description: 定一个潘金莲是什么样的人
 * @author: Michael
 * @create: 2019-04-21 22:42
 */
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲在和男人做那个.....");
    }
}
