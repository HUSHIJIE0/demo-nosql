package com.example.demo.jpa.mysql;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Michael
 * @Date: Created in 9:59 2018/11/27
 * @Desciption:
 */
public interface UserJpaRepository extends JpaRepository<User, Integer> {

}