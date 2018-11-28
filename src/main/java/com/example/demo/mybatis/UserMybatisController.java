package com.example.demo.mybatis;

import com.example.demo.aspect.annotationaspect.WebDesc;
import com.example.demo.mybatis.domain.UserMybatis;
import com.example.demo.mybatis.service.UserMybatisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Michael
 * @Date: Created in 16:37 2018/11/27
 * @Desciption:
 */
@RestController
@RequestMapping("/userMybatis")
public class UserMybatisController {
    @Resource
    private UserMybatisService userService;

    @GetMapping("/showUser")
    @ResponseBody
    public UserMybatis toIndex(Integer id){
        UserMybatis user = this.userService.getUserById(id);
        return user;
    }

    @GetMapping("/getUser")
    @ResponseBody
    @WebDesc
    public UserMybatis getUser(){
        UserMybatis user = new UserMybatis();
        user.setAge(100);
        user.setUserName("Michael");
        user.setId(1000);
        return user;
    }
}
