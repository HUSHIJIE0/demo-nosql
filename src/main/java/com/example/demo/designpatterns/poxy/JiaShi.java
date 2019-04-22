package com.example.demo.designpatterns.poxy;

/**
 * @program: demo
 * @description: 水浒里还有没有这类型的女人？有，卢俊义的老婆贾氏（就是和那个固管家苟合 的那个），这名字起的：“假使”，那我们也让王婆做她的代理
 * @author: Michael
 * @create: 2019-04-21 23:49
 */
public class JiaShi implements  KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏正在Happy中......");
    }
}
