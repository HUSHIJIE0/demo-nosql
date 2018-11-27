package com.example.demo.mybatis.service.impl;

import com.example.demo.mybatis.dao.UserMybatisDao;
import com.example.demo.mybatis.domain.UserMybatis;
import com.example.demo.mybatis.service.UserMybatisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Michael
 * @Date: Created in 16:54 2018/11/27
 * @Desciption:
 */
@Service("userMybatisService")
public class UserMybatisServiceImpl implements UserMybatisService {
    @Resource
    private UserMybatisDao userMybatisDao;

    @Override
    public UserMybatis getUserById(int userId) {
        return userMybatisDao.selectByPrimaryKey(userId);
    }

    @Override
    public boolean addUser(UserMybatis record){
        boolean result = false;
        try {
            userMybatisDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
