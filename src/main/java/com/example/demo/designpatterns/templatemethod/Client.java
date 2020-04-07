package com.example.demo.designpatterns.templatemethod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/04/11:33
 * @Description: 客户开始使用这个模型
 */
public class Client {

    public static void main(String[] args) {
        //客户开着H1型号，出去遛弯了
        HummerModel h1 = new HummerH1Model();
        h1.run(); //汽车跑起来了；
        System.out.println("===============================");

        //客户开H2型号，出去玩耍了
        HummerModel h2 = new HummerH2Model();
        h2.run();
        System.out.println("===============================");

        HummerH2Model h22 = new HummerH2Model();
        h22.run(); //H2型号的悍马跑起来
        System.out.println("===============================");

        //客户开着H1型号，出去遛弯了
        HummerH1Model h11 = new HummerH1Model();
        h11.setAlarm(true);
        h11.run(); //汽车跑起来了；
    }
}
