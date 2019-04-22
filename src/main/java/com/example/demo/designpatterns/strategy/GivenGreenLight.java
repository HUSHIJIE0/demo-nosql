package com.example.demo.designpatterns.strategy;

/**
 * @program: demo
 * @description: 求吴国太开个绿灯
 * @author: Michael
 * @create: 2019-04-21 21:37
 */
public class GivenGreenLight implements Istrategy{
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
