package com.example.demo.designpatterns.adapter;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2019/12/04/9:58
 * @Description: 外系统的人员信息
 */
public interface IOuterUser {

    //基本信息，比如名称，性别，手机号码了等
    public Map getUserBaseInfo();

    //工作区域信息
    public Map getUserOfficeInfo();

    //用户的家庭信息
    public Map getUserHomeInfo();
}
