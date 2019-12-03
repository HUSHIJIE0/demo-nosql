package com.example.demo.designpatterns.abstractfactory.blackHuman;

import com.example.demo.designpatterns.abstractfactory.Human;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/03/16:24
 * @Description:
 *黑色人类，记得中学学英语，老师说black man是侮辱人的意思，不懂，没跟老外说话
 */
public abstract class AbstractBlackHuman implements Human {

    public void cry() {
        System.out.println("黑人会哭");
    }
    public void laugh() {
        System.out.println("黑人会笑");
    }
    public void talk() {
        System.out.println("黑人可以说话，一般人听不懂");
    }
}
