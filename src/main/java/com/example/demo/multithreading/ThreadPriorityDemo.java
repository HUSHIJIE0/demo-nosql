package com.example.demo.multithreading;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/10/17/17:14
 * @Description: 线程的优先级
 */
public class ThreadPriorityDemo {
    public static void main(String args[]){
        Thread t1 = new Thread(new MyThreadPriorityDemo(),"线程A") ;  // 实例化线程对象
        Thread t2 = new Thread(new MyThreadPriorityDemo(),"线程B") ;  // 实例化线程对象
        Thread t3 = new Thread(new MyThreadPriorityDemo(),"线程C") ;  // 实例化线程对象
        t1.setPriority(Thread.MIN_PRIORITY) ;   // 优先级最低
        t2.setPriority(Thread.MAX_PRIORITY) ;   // 优先级最高
        t3.setPriority(Thread.NORM_PRIORITY) ;  // 优先级最中等
        t1.start() ;    // 启动线程
        t2.start() ;    // 启动线程
        t3.start() ;    // 启动线程
    }
}

class MyThreadPriorityDemo implements Runnable{ // 实现Runnable接口
    public void run(){  // 覆写run()方法
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(500) ; // 线程休眠
            }catch(InterruptedException e){
            }
            System.out.println(Thread.currentThread().getName()
                    + "运行，i = " + i) ;  // 取得当前线程的名字
        }
    }
}