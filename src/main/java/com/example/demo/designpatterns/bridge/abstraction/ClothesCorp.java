package com.example.demo.designpatterns.bridge.abstraction;

import com.example.demo.designpatterns.bridge.implementor.Clothes;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/02/20:32
 * @Description: 服装公司，这个行当现在不怎么样
 */
public class ClothesCorp extends Corp {

    //Clothes
    public ClothesCorp(Clothes clothes) {
        super(clothes);
    }

    //服装公司，赚钱，计算利润
    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚大钱了...");
    }

//    //服装公司生产的就是衣服了
//    protected void produce() {
//        System.out.println("服装公司生产衣服...");
//    }
//    //服装公司买服装，可只卖服装，不买穿衣服的模特
//    protected void sell() {
//        System.out.println("服装公司出售衣服...");
//    }
//
//    //服装公司不景气，但怎么说也是赚钱行业也
//    public void makeMoney(){
//        super.makeMoney();
//        System.out.println("服装公司赚小钱...");
//    }


}
