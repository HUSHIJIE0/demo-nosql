package com.example.demo.designpatterns.templatemethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/04/11:22
 * @Description:
 * 悍马车是每个越野者的最爱，其中H1最接近军用系列
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true; //是否要响喇叭

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }
    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是有客户的来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }

//
//    /*
//    * 这个方法是很有意思的，它要跑，那肯定要启动，停止了等，也就是要调其他方法
//     */
//    @Override
//    public void run() {
//
//        //先发动汽车
//        this.start();
//
//        //引擎开始轰鸣
//        this.engineBoom();
//
//        //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
//        this.alarm();
//
//        //到达目的地就停车
//        this.stop();
//    }

}
