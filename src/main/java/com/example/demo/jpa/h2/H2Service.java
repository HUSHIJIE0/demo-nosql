package com.example.demo.jpa.h2;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Michael
 * @Date: Created in 15:09 2018/11/27
 * @Desciption:
 */
public interface H2Service extends JpaRepository<JpaTest,Integer> {

}
