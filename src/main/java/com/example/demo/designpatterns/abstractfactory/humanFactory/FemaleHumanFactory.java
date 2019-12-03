package com.example.demo.designpatterns.abstractfactory.humanFactory;

import com.example.demo.designpatterns.abstractfactory.Human;
import com.example.demo.designpatterns.abstractfactory.HumanEnum;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/03/16:41
 * @Description:
 * 女性创建工厂
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    //创建一个女性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
    //创建一个女性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }
    //创建一个女性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloFemaleHuman);
    }
}
