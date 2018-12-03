package com.example.demo.io;

import org.springframework.stereotype.Component;

import java.io.*;

/**
 * @Author: Michael
 * @Date: Created in 14:23 2018/11/30
 * @Desciption:
 */
@Component
public class FileOperation {

    /**
     * 读入TXT文件
     */
    public void readFile(String pathName) {
        // pathname 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
        //不关闭文件会导致资源的泄露，读写文件都同理
        try {
            FileReader reader = new FileReader(pathName);
            // 建立一个对象，它把文件内容转成计算机能读懂的语言
            BufferedReader br = new BufferedReader(reader);
            String line;
            //网友推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 写入TXT文件
     */
    public void writeFile(String pathName,String content) {
        try {
            // 相对路径，如果没有则要建立一个新的output.txt文件
            File writeName = new File(pathName);
            // 创建新文件,有同名的文件的话直接覆盖
            writeName.createNewFile();
            FileWriter writer = new FileWriter(writeName);
            BufferedWriter out = new BufferedWriter(writer);
            out.write(content);
            // 把缓存区内容压入文件
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dataIOWrite(String pathName) {
        try {
            OutputStream out = new FileOutputStream(pathName);
            //DataOutputStream 实现基本类型数据的序列化
            //将基本类型数据拆开为byte序列，写入到out流中
            DataOutputStream dos = new DataOutputStream(out);
            dos.write(-2);
            dos.writeInt(-2);
            dos.writeLong(-2);
            dos.writeByte(-2);
            dos.writeDouble(-2);
            dos.writeShort(-2);
            dos.writeFloat(-2);
            dos.writeBoolean(true);
            dos.writeChar('中');
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void dataIORead(String pathName) {
        try {
            InputStream in = new FileInputStream(pathName);
            //DataInputStream 从基本流中读取基本类型数据,实现基本
            //类型数据的反序列化
            DataInputStream dis = new DataInputStream(in);
            int b = dis.read();
            int i = dis.readInt();
            long l= dis.readLong();
            byte bx = dis.readByte();
            double d = dis.readDouble();
            short s = dis.readShort();
            float f = dis.readFloat();
            boolean bol = dis.readBoolean();
            char c = dis.readChar();
            dis.close();
            System.out.print( b +" ");//254  fe
            System.out.print(i+" ");
            System.out.print(l+" ");
            System.out.print(bx+" ");
            System.out.print(d+" ");
            System.out.print(s+" ");
            System.out.print(f+" ");
            System.out.print(bol+" ");
            System.out.print(c+" ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
