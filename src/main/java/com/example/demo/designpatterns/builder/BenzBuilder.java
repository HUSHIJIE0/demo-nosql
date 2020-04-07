package com.example.demo.designpatterns.builder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/05/19:48
 * @Description: 各种设施都给了，我们按照一定的顺序制造一个奔驰车
 */
public class BenzBuilder  extends CarBuilder {

    private BenzModel benz = new BenzModel();
    @Override
    public CarModel getCarModel() {
        return this.benz;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

}
