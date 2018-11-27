package com.example.demo.jpa.h2;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Michael
 * @Date: Created in 15:09 2018/11/27
 * @Desciption:
 */
@Entity
@Table(name = "jpa_test")
@Data
public class JpaTest {
    @Id
    private int id;
    private String name;
    private String sex;
}

