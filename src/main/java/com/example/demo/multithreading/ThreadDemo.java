package com.example.demo.multithreading;

/**
 * 取得和设置线程的名称
 */
public class ThreadDemo {
    public static void main(String args[]){
        MyThreadDemo my=new MyThreadDemo();  //定义Runnable子类对象
        new Thread(my).start();    //系统自动设置线程名称
        new Thread(my,"线程A").start();  //手工设置线程名称
    }
}

class MyThreadDemo implements Runnable{ //实现Runnable接口
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"运行, i="+i);  //取得当前线程的名称
        }
    }
};