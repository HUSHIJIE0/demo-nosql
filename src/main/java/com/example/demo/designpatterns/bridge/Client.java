package com.example.demo.designpatterns.bridge;

import com.example.demo.designpatterns.bridge.abstraction.HouseCorp;
import com.example.demo.designpatterns.bridge.abstraction.ShanZhaiCorp;
import com.example.demo.designpatterns.bridge.implementor.Clothes;
import com.example.demo.designpatterns.bridge.implementor.House;
import com.example.demo.designpatterns.bridge.implementor.IPod;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/02/20:33
 * @Description: 我要关心我自己的公司了
 */
public class Client {

    public static void main(String[] args) {
//        System.out.println("-------房地产公司是这个样子运行的-------");
//        //先找到我的公司
//        HouseCorp houseCorp =new HouseCorp();
//        //看我怎么挣钱
//        houseCorp.makeMoney();
//        System.out.println("\n");
//
//        System.out.println("-------服装公司是这样运行的-------");
//        ClothesCorp clothesCorp = new ClothesCorp();
//        clothesCorp.makeMoney();
//
//        System.out.println("-------山寨公司是这样运行的-------");
//        IPodCorp iPodCorp = new IPodCorp();
//        iPodCorp.makeMoney();



        House house = new House();
        System.out.println("-------房地产公司是这个样子运行的-------");
        //先找到我的公司
        HouseCorp houseCorp =new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");

        //山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();

    }
}
