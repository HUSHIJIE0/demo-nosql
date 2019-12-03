package com.example.demo.designpatterns.abstractfactory.yellowHuman;

import com.example.demo.designpatterns.abstractfactory.Human;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/03/16:22
 * @Description:
 * 为什么要修改成抽象类呢？要定义性别呀
 */
public abstract class AbstractYellowHuman implements Human {

    public void cry() {
        System.out.println("黄色人类会哭");
    }

    public void laugh() {
        System.out.println("黄色人类会大笑，幸福呀！");
    }

    public void talk() {
        System.out.println("黄色人类会说话，一般说的都是双字节");
    }
}
