package com.example.demo.mybatis.service;

import com.example.demo.mybatis.domain.UserMybatis;

/**
 * @Author: Michael
 * @Date: Created in 16:53 2018/11/27
 * @Desciption:
 */
public interface UserMybatisService {
     UserMybatis getUserById(int userId);

    boolean addUser(UserMybatis record);
}
