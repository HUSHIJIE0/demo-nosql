package com.example.demo.designpatterns.command.command;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/08/20:55
 * @Description: 增加一项需求
 */
public class AddRequirementCommand extends Command {

    //执行增加一项需求的命令
    public void execute() {
        //找到需求组
        super.rg.find();

        //增加一份需求
        super.rg.add();

        //给出计划
        super.rg.plan();
    }
}
