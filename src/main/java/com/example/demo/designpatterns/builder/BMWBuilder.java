package com.example.demo.designpatterns.builder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/05/19:49
 * @Description: 给定一个顺序，返回一个宝马车
 */
public class BMWBuilder  extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}
