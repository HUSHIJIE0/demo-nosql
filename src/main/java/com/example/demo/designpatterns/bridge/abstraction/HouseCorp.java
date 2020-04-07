package com.example.demo.designpatterns.bridge.abstraction;

import com.example.demo.designpatterns.bridge.implementor.House;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/02/20:30
 * @Description: 房地产公司，按照翻译来说应该叫realty corp，这个是比较准确的翻译
 * * 但是我问你房地产公司翻译成英文，你第一反应什么？对嘛还是house corp!
 */
public class HouseCorp extends Corp {

    //定义传递一个House产品进来
    public HouseCorp(House house) {
        super(house);
    }

    //房地产公司很High了，赚钱，计算利润
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }

//    //房地产公司就是盖房子
//    protected void produce() {
//        System.out.println("房地产公司盖房子...");
//    }
//
//    //房地产卖房子，自己住那可不赚钱
//    protected void sell() {
//        System.out.println("房地产公司出售房子...");
//    }
//
//    //房地产公司很High了，赚钱，计算利润
//    public void makeMoney(){
//        super.makeMoney();
//        System.out.println("房地产公司赚大钱了...");
//    }

}
