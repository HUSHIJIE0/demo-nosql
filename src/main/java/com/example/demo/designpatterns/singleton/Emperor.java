package com.example.demo.designpatterns.singleton;

/**
 * @program: demo
 * @description: 中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来
 * @author: Michael
 * @create: 2019-04-22 00:03
 */
public class Emperor {
    private static  Emperor emperor = null;

    private Emperor() {
    }

    public static Emperor getInstance() {
        if (emperor == null) { //如果皇帝还没有定义，那就定一个
            emperor = new Emperor();
        }
        return emperor;
    }

    //皇帝叫什么名字呀
    public static void emperorInfo(){
        System.out.println("我就是皇帝某某某....");
    }
}
