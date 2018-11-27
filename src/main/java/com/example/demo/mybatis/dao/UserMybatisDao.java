package com.example.demo.mybatis.dao;

import com.example.demo.mybatis.domain.UserMybatis;
import org.springframework.stereotype.Repository;

/**
 * @Author: Michael
 * @Date: Created in 16:42 2018/11/27
 * @Desciption:
 */
@Repository
public interface UserMybatisDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMybatis record);

    int insertSelective(UserMybatis record);

    UserMybatis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMybatis record);

    int updateByPrimaryKey(UserMybatis record);
}

