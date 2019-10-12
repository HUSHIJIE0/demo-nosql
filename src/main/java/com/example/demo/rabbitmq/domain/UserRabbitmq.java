package com.example.demo.rabbitmq.domain;

/**
 * @Author: Michael
 * @Date: Created in 17:43 2018/11/28
 * @Desciption:
 */
import lombok.Data;

import java.io.Serializable;

@Data
public class UserRabbitmq implements Serializable {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "UserRabbitmq{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
