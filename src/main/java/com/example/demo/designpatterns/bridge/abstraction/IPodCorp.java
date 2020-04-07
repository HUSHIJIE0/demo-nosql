package com.example.demo.designpatterns.bridge.abstraction;

import com.example.demo.designpatterns.bridge.implementor.IPod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/02/20:34
 * @Description: 我是山寨老大，你流行啥我就生产啥
 * * 现在流行iPod
 */
public class IPodCorp extends Corp {
    //定义传递一个IPod产品进来
    public IPodCorp(IPod iPod) {
        super(iPod);
    }

    //IPod公司很High了，赚钱，计算利润
    public void makeMoney(){
        super.makeMoney();
        System.out.println("IPod公司赚大钱了...");
    }

//    //我开始生产iPod了
//    protected void produce() {
//        System.out.println("我生产iPod...");
//    }
//
//    //山寨的iPod很畅销，便宜呀
//    protected void sell() {
//        System.out.println("iPod畅销...");
//    }
//
//    //狂赚钱
//    public void makeMoney(){
//        super.makeMoney();
//        System.out.println("我赚钱呀...");
//    }


}
