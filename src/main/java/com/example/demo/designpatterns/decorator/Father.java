package com.example.demo.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: Michael
 * @Date: 2020/01/08/22:16
 * @Description: 老爸看成绩单了
 */
public class Father {
    public static void main(String[] args) {
        //成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();

        //看成绩单
        sr.report();

        //签名？休想！

        System.out.println("=======================================================");

        //美化过的成绩单拿过来
        sr= new SugarFouthGradeSchoolReport();

        //看成绩单
        sr.report();

        //然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三


        System.out.println("=======================================================");


        sr = new FouthGradeSchoolReport(); //原装的成绩单

        //加 了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);

        //又加了成绩排名的说明
        sr = new SortDecorator(sr);

        //看成绩单
        sr.report();

        //然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
    }
}
