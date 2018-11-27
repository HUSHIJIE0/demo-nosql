package com.example.demo.reflect;

/**
 * @Author: Michael
 * @Date: Created in 15:59 2018/11/22
 * @Desciption:
 */
public class Student {
    public String name;
    private int age;

    public Student() {
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show(String msg){
        System.out.println("show方法 = " + msg);
    }
    private void speak(String msg,int number){
        System.out.println("speak方法 = " + msg +":"+ number );
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age +'}';
    }
}
