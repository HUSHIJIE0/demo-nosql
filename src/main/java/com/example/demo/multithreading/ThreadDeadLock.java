package com.example.demo.multithreading;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/10/17/17:36
 * @Description: 死锁
 */
public class ThreadDeadLock implements Runnable {
    private static ZhangSan zs = new ZhangSan() ;       // 实例化static型对象
    private static LiSi ls = new LiSi() ;       // 实例化static型对象
    private boolean flag = false ;  // 声明标志位，判断那个先说话
    public void run(){  // 覆写run()方法
        if(flag){
            synchronized(zs){   // 同步张三
                zs.say() ;
                try{
                    Thread.sleep(500) ;
                }catch(InterruptedException e){
                    e.printStackTrace() ;
                }
                synchronized(ls){
                    zs.get() ;
                }
            }
        }else{
            synchronized(ls){
                ls.say() ;
                try{
                    Thread.sleep(500) ;
                }catch(InterruptedException e){
                    e.printStackTrace() ;
                }
                synchronized(zs){
                    ls.get() ;
                }
            }
        }
    }

    public static void main(String args[]){
        ThreadDeadLock t1 = new ThreadDeadLock() ;      // 控制张三
        ThreadDeadLock t2 = new ThreadDeadLock() ;      // 控制李四
        t1.flag = true ;
        t2.flag = false ;
        Thread thA = new Thread(t1) ;
        Thread thB = new Thread(t2) ;
        thA.start() ;
        thB.start() ;
    }
}

class ZhangSan{ // 定义张三类
    public void say(){
        System.out.println("张三对李四说：“你给我画，我就把书给你。”") ;
    }
    public void get(){
        System.out.println("张三得到画了。") ;
    }
}

class LiSi{ // 定义李四类
    public void say(){
        System.out.println("李四对张三说：“你给我书，我就把画给你”") ;
    }
    public void get(){
        System.out.println("李四得到书了。") ;
    }
}
