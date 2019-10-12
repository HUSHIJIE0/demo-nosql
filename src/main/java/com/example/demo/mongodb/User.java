package com.example.demo.mongodb;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @Author: Michael
 * @Date: Created in 15:51 2018/11/21
 * @Desciption:
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    @Id
    private Long id;
    private String username;
    private Integer age;

    public User(Long id, String username, Integer age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "\"User:{\"id\":\""+id+"\",\"username\":\""+username+"\",\"age\":\""+age+"\"}\"";
    }
}