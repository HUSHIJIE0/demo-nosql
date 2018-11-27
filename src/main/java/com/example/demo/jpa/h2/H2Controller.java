package com.example.demo.jpa.h2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Michael
 * @Date: Created in 15:10 2018/11/27
 * @Desciption:
 */
@RestController
@RequestMapping("h2")
public class H2Controller {
    @Autowired
    private H2Service service;

    @RequestMapping("/test")
    public String jpaTest() {
        JpaTest jpaTest = new JpaTest();
        jpaTest.setId(1);
        jpaTest.setName("zhangsan");
        jpaTest.setSex("1");
        service.save(jpaTest);
        return service.findAll().toString();
    }
}