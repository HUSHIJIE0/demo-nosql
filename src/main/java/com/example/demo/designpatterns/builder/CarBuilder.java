package com.example.demo.designpatterns.builder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/05/19:47
 * @Description: 要什么顺序的车，你说，我给建造出来
 */
public abstract class CarBuilder {

    //建造一个模型，你要给我一个顺序要，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
