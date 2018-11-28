package com.example.demo.mybatis;

import com.example.demo.DemoApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * @Author: Michael
 * @Date: Created in 10:07 2018/11/28
 * @Desciption:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@WebAppConfiguration
public class UserMybatisControllerTest {
    @Autowired
    private UserMybatisController userMybatisController;


    @Before
    public void setUp() throws Exception {
        System.out.println("This is Before!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("This is After!");
    }

    @Test
    public void toIndex() {
        userMybatisController.toIndex(1);
    }

    @Test
    public void getUser() {
        userMybatisController.getUser();
    }
}