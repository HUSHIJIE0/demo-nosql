package com.example.demo.designpatterns.command.invoker;

import com.example.demo.designpatterns.command.command.Command;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/08/20:57
 * @Description: 接头人的职责就是接收命令，并执行
 */
public class Invoker {

    //什么命令
    private Command command;

    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }

    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
