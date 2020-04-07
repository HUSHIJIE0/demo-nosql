package com.example.demo.designpatterns.command.command;

import com.example.demo.designpatterns.command.CodeGroup;
import com.example.demo.designpatterns.command.PageGroup;
import com.example.demo.designpatterns.command.RequirementGroup;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/08/20:53
 * @Description: 命令的抽象类，我们把客户发出的命令定义成一个一个的对象
 */
public abstract class Command {

    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();//需求组
    protected PageGroup pg = new PageGroup(); //美工组
    protected CodeGroup cg = new CodeGroup(); //代码组;

    //只要一个方法，你要我做什么事情
    public abstract void execute();
}
