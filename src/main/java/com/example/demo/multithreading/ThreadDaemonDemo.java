package com.example.demo.multithreading;

/**
 * 后台线程
 */
public class ThreadDaemonDemo {
    public static void main(String args[]){
        MyThreadDaemonDemo mt = new MyThreadDaemonDemo() ;  // 实例化Runnable子类对象
        Thread t = new Thread(mt,"线程");     // 实例化Thread对象
        t.setDaemon(true) ; // 此线程在后台运行
        t.start() ; // 启动线程
    }
    //尽管 run() 方法中是死循环的方式，但是程序依然可以执行完，因为方法中死循环的线程操作已经设置成后台运行
}

class MyThreadDaemonDemo implements Runnable{ // 实现Runnable接口
    public void run(){  // 覆写run()方法
        while(true){
            System.out.println(Thread.currentThread().getName() + "在运行。") ;
        }
    }
}
