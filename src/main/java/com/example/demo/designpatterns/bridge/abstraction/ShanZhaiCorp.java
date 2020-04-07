package com.example.demo.designpatterns.bridge.abstraction;

import com.example.demo.designpatterns.bridge.implementor.Product;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/02/20:50
 * @Description: 我是山寨老大，你流行啥我就生产啥
 */
public class ShanZhaiCorp extends Corp {

    //产什么产品，不知道，等被调用的才知道
    public ShanZhaiCorp(Product product){
        super(product);
    }

    //狂赚钱
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }

}
