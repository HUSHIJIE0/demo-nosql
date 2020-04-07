package com.example.demo.designpatterns.builder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/05/19:43
 * @Description: 最终客户开始使用这个模型
 */
public class Client {
    public static void main(String[] args) {
//        /*
//         * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
//         * 说要这样一个模型，这样一个顺序，然后我就来制造
//         */
//        BenzModel benz = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
//
//        sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
//        sequence.add("start"); //启动起来
//        sequence.add("stop"); //开了一段就停下来
//
//        //然后我们把这个顺序给奔驰车：
//        benz.setSequence(sequence);
//        benz.run();


        /*
         * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        ArrayList<String> sequence = new ArrayList<String>(); //存放run的顺序
        sequence.add("engine boom"); //客户要求，run的时候时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来

        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();


        //按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();


        /* 这里是牛叉公司的天下，他要啥我们给啥
         */

        Director director = new Director();

        //1W辆A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }

        //100W辆B类型的奔驰车
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }

        //1000W量C类型的宝马车
        for (int i = 0; i < 10000000; i++) {
            director.getCBMWModel().run();
        }
    }


    /**
     * Client 就是牛叉公司，这个到具体的应用中就是其他的模块或者页面；
     * CarModel 以及两个实现类 BenzModel 和 BMWModel 叫做产品类(Product Class)，这个产品类实现
     * 了模板方法模式，也就是有模板方法和基本方法，这个参考上一节的模板方法模式；
     * CarBuilder 以及两个实现类 BenzBuilder 和 BMWBuilder 叫做建造者(Builder Class)，在上面的
     * 那个例子中就是我和我的团队，负责建造 Benz 和 BMW 车模，按照指定的顺序；
     * Director 类叫做导演类(Director Class),负责安排已有模块的顺序，然后告诉 Builder 开始建造，
     * 在上面的例子中就是我们的老大，Client 找到老大，说我要这个，这个，那个类型的车辆模型，然后老大就把
     * 命令传递给我，我和我的团队就开始拼命的建造，于是一个项目建设完毕了。
     */

}

