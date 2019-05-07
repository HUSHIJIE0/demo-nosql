package com.example.demo.test;

import lombok.Data;

/**
 * @program: demo
 * @description: 父类
 * @author: Michael
 * @create: 2019-04-23 00:31
 */
@Data
public class Father {
    private String sex;
    private String name;

    public void talk(){
        System.out.println("I Can Talk Aloud");
    }

    public void eat(){
        System.out.println("I Can Eat More");
    }

}
