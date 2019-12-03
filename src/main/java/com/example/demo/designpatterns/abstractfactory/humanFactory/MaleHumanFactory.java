package com.example.demo.designpatterns.abstractfactory.humanFactory;

import com.example.demo.designpatterns.abstractfactory.Human;
import com.example.demo.designpatterns.abstractfactory.HumanEnum;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/03/16:40
 * @Description:
 * 男性创建工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    //创建一个男性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
    //创建一个男性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
    //创建一个男性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }

}
