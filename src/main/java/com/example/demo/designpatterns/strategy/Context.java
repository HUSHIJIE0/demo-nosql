package com.example.demo.designpatterns.strategy;

/**
 * @program: demo
 * @description: 计谋有了，那还要有锦囊
 * @author: Michael
 * @create: 2019-04-21 21:48
 */
public class Context {

    //构造函数，你要使用那个妙计
    private Istrategy strategy;
    public Context(Istrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋了，看我出招了
    public void operate(){
        this.strategy.operate();
    }
}
