package com.example.demo.designpatterns.command.command;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/08/20:56
 * @Description: 删除一个页面的命令
 */
public class DeletePageCommand extends Command {

    //执行删除一个页面的命令
    public void execute() {
        //找到页面组
        super.pg.find();

        //删除一个页面
        super.rg.delete();

        //给出计划
        super.rg.plan();
    }
}
