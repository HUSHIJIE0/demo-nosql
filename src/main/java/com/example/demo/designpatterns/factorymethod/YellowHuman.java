package com.example.demo.designpatterns.factorymethod;

/**
 * @program: demo
 * @description: 黄色人类，这个翻译的不准确，将就点吧
 * @author: Michael
 * @create: 2019-04-22 21:50
 */
public class YellowHuman implements  Human {
    @Override
    public void laugh() {
        System.out.println("黄色人类会哭");
    }

    @Override
    public void cry() {
        System.out.println("黄色人类会大笑，幸福呀！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人类会说话，一般说的都是双字节");
    }
}
