package com.example.demo.designpatterns.multition;

/**
 * @program: demo
 * @description: 大臣们悲惨了，一个皇帝都伺候不过来了，现在还来了两个个皇帝 * TND，不管了，找到个皇帝，磕头，请安就成了！
 * @author: Michael
 * @create: 2019-04-22 12:53
 */
public class Minister {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int ministerNum =100; //10个大臣

        for(int i=0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }

    /**
     * 有的大臣可是有骨气，只拜一个真神，你怎么处理？这个问题太简单，
     * 懒的详细回答你，getInstance(param)是不是就解决了这个问题？
     */
}
