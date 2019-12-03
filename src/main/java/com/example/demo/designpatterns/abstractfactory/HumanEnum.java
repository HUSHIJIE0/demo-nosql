package com.example.demo.designpatterns.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/03/16:31
 * @Description: 世界上有哪些类型的人，列出来
 */
public enum HumanEnum {

    //把世界上所有人类型都定义出来
    YelloMaleHuman("com.example.demo.designpatterns.abstractfactory.yellowHuman.YellowMaleHuman"),

    YelloFemaleHuman("com.example.demo.designpatterns.abstractfactory.yellowHuman.YellowFemaleHuman"),

    WhiteFemaleHuman("com.example.demo.designpatterns.abstractfactory.whiteHuman.WhiteFemaleHuman"),

    WhiteMaleHuman("com.example.demo.designpatterns.abstractfactory.whiteHuman.WhiteMaleHuman"),

    BlackFemaleHuman("com.example.demo.designpatterns.abstractfactory.blackHuman.BlackFemaleHuman"),

    BlackMaleHuman("com.example.demo.designpatterns.abstractfactory.blackHuman.BlackMaleHuman");

    private String value = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
