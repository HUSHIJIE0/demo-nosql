package com.example.demo.io;

import com.example.demo.DemoApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Michael
 * @Date: Created in 15:09 2018/11/30
 * @Desciption:
 */
public class FileOperationTest extends DemoApplicationTests {

    @Autowired
    FileOperation fileOperation;

    @Test
    public void readFile() {
        String pathName = "C:\\Users\\hushi\\Desktop\\新HIS\\output.txt";
        fileOperation.readFile(pathName);
    }

    @Test
    public void writeFile() {
    }

    @Test
    public void dataIOWrite() {
    }

    @Test
    public void dataIORead() {
    }

    @Test
    public void readFileByPath() {
        String pathName = "C:\\Users\\Michael\\Desktop\\GJB9001C-2017标准-.doc.doc";
        fileOperation.readFileByPath(pathName);
    }
}