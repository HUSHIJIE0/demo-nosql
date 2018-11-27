package com.example.demo.reflect;

import java.lang.reflect.Field;

/**
 * @Author: Michael
 * @Date: Created in 15:59 2018/11/22
 * @Desciption:
 */
public class ReflectDemo {

    public static void main(String[] args) {
        try {
            //三种方式获取Class对象
//            Student student = new Student();
//            Class studentClass1 = student.getClass();
//            System.out.println(studentClass1);
//
//            String clazzName = "com.example.demo.reflect.Student";
//            Class<?> studentClass2 = Class.forName(clazzName);
//            System.out.println(studentClass2);
//
//            System.out.println(Student.class);


            //反射的使用1：构造器（Constructor）的反射

            //获取Class对象
//            Class<?> clazz = Student.class;
//           /*
//               根据参数类型获取相应的构造器
//               参数类型是形参类型
//            */
//            Constructor<?> constructor = clazz.getConstructor();
//           /*
//               创建实例
//               参数类型是实参类型（形参一一对应）
//            */
//            Object obj = constructor.newInstance();
//            System.out.println("obj = " + obj);


//            Object obj = clazz.newInstance();
//            System.out.println("obj = " + obj);




            //在Student类中 ，还有一个私有的构造器，正常方式下是不能通过私有构造器创建对象的。，但是反射可以做到
//            Class<?> clazz = Student.class;
//           /*
//               获取构造
//               因为权限是私有，但getConstructor()只能获取public修饰的方法
//               getDeclaredConstructor():获取声明的方法。只要声明的就可以
//            */
//            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
//            System.out.println("满参私有构造 ：" + constructor);
//           /*
//               私有构造，newInstance会产生非法访问异常：java.lang.IllegalAccessException
//               所以要改变权限setAccessible() -->暴力反射
//            */
//            constructor.setAccessible(true);
//            Object obj = constructor.newInstance("小明",20);
//
//            System.out.println("obj = " + obj);


            //反射的使用2：方法（Method）的反射

            //使用反射调用（非私有）方法
            //获取Class对象
//            Student student = new Student();
//            Class clazz = student.getClass();
//           /*
//               getMethod():获取Class对象里的方法
//               参数一：方法名
//               参数二：参数列表类型
//            */
//            Method show = clazz.getMethod("show", String.class);
//           /*
//               调用show方法需要对象和参数
//               invoke()方法：调用的意思
//               参数一：调用此方法的对象
//               参数二：调用此方法需要传入的实参
//            */
//            show.invoke(student, "hello public show");


            //私有方法的反射
//            //获取Class对象
//            Student student = new Student();
//            Class clazz = student.getClass();
//           /*
//               getDeclaredMethod():获取Class对象里的声明过的方法(包括)
//               参数一：方法名
//               参数二：参数列表类型
//            */
//            Method speak = clazz.getDeclaredMethod("speak", String.class, int.class);
//            //私有方法，暴力反射
//            speak.setAccessible(true);
//           /*
//               调用show方法需要对象和参数
//               invoke()方法：调用的意思
//               参数一：调用此方法的对象
//               参数二：调用此方法需要传入的实参
//            */
//            speak.invoke(student, "hello private speak",2018);


            //反射的使用3：属性（Field）的反射

            //共有属性name的赋值
            //获取Class对象,参数全限定名
//            Class<?> clazz = Class.forName("com.example.demo.reflect.Student");
//           /*
//               getField():通过属性名获取属性
//            */
//            Field name = clazz.getField("name");
//            //获取对象
//            Object obj = clazz.newInstance();
//           /*
//               设置一个值
//               参数一：哪个对象的属性值
//               参数二：参数
//            */
//            name.set(obj,"张三");
//            System.out.println(obj);

            //私有属性的反射
            //获取Class对象,参数全限定名
            Class clazz = Class.forName("com.example.demo.reflect.Student");
           /*
               getDeclaredField():通过属性名获取（所有权限）属性
            */
            Field age = clazz.getDeclaredField("age");
            //暴力反射
            age.setAccessible(true);
            //创建对象
            Object obj = clazz.newInstance();
           /*
               设置一个值
               参数一：哪个对象的属性值
               参数二：参数
            */
            age.set(obj,20);
            System.out.println(obj);


//            使用java的反射机制，一般需要遵循三步：
//
//            获得你想操作类的Class对象
//
//            通过第一步获得的Class对象去取得操作类的方法或是属性名
//
//            操作第二步取得的方法或是属性



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
