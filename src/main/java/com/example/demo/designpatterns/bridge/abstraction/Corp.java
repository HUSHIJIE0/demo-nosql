package com.example.demo.designpatterns.bridge.abstraction;

import com.example.demo.designpatterns.bridge.implementor.Product;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/24/17:07
 * @Description: 定义一个公司的抽象类
 */
public abstract class Corp {

    //定义一个产品对象，抽象的了，不知道具体是什么产品
    private Product product;

    //构造函数，由子类定义传递具体的产品进来
    public Corp(Product product){
        this.product = product;
    }

    //公司是干什么的？赚钱的呀，不赚钱傻子才干
    public void makeMoney(){

        //每个公司都是一样，先生产
        this.product.beProducted();

        //然后销售
        this.product.beSelled();

    }
//    /*
//     * 是公司就应该有生产把，甭管是什么软件公司还是制造业公司
//     * 那每个公司的生产的东西都不一样，所以由实现类来完成
//     */
//    protected abstract void produce();
//
//    /*
//     * 有产品了，那肯定要销售呀，不销售你公司怎么生存
//     */
//    protected abstract void sell();
//
//    //公司是干什么的？赚钱的呀，不赚钱傻子才干
//    public void makeMoney(){
//
//        //每个公司都是一样，先生产
//        this.produce();
//
//        //然后销售
//        this.sell();
//    }

}
