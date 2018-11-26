package com.example.demo.other;

import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Michael
 * @Date: Created in 14:30 2018/11/26
 * @Desciption:
 */
@RestController
public class DemoTest {
    public static void main(String[] args) {
        RunnerDemo runnerDemo1 = new RunnerDemo();
        RunnerDemo1 runnerDemo2 = new RunnerDemo1();

        Thread thread1 = new Thread(runnerDemo1);
        Thread thread2 = new Thread(runnerDemo2);
        thread1.start();
        thread2.start();
    }

}
class RunnerDemo implements Runnable{
    int len = 100;

    @Override
    public void run() {
        for (int i=0;i<len;i++){
            System.out.println("=======================================");
        }
    }
}

class RunnerDemo1 implements Runnable{
    int len = 100;

    @Override
    public void run() {
        for (int i=0;i<len;i++){
            System.out.println("++++++++++++++++++++++++++++++++++++++");
        }
    }
}
