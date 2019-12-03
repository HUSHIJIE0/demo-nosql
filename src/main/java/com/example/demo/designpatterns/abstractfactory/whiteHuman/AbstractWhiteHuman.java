package com.example.demo.designpatterns.abstractfactory.whiteHuman;

import com.example.demo.designpatterns.abstractfactory.Human;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/03/16:24
 * @Description:
 *白色人人类
 * 为了代码整洁，新建一个包，这里是白种人的天下了
 */
public abstract class AbstractWhiteHuman implements Human {

    public void cry() {
        System.out.println("白色人类会哭");
    }

    public void laugh() {
        System.out.println("白色人类会大笑，侵略的笑声");
    }

    public void talk() {
        System.out.println("白色人类会说话，一般都是但是单字节！");
    }
}
