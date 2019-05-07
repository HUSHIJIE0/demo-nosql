package com.example.demo.designpatterns.abstractfactory;

/**
 * @program: demo
 * @description: ceshi
 * @author: Michael
 * @create: 2019-04-23 23:16
 */
public class Test {


    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            str.append("66666666");
        }
        System.out.println(str.toString());
    }
}
