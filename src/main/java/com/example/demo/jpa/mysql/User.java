package com.example.demo.jpa.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Michael
 * @Date: Created in 9:57 2018/11/27
 * @Desciption:
 */
@Entity // This tells Hibernate to make a table out of this class
@Data
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;


}