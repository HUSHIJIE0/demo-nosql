package com.example.demo.mongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Michael
 * @Date: Created in 10:30 2018/11/21
 * @Desciption:
 */
@RestController
@RequestMapping(value="user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;


    //http://localhost:8888/user/save
    @GetMapping("save")
    public String save(){
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        userRepository.save(new User(4L, "didi2", 30));
        userRepository.save(new User(5L, "mama", 40));
        userRepository.save(new User(6L, "kaka2", 50));
        userRepository.save(new User(7L, "kaka", 50));
        userRepository.save(new User(8L, "kao", 50));
        userRepository.save(new User(9L, "ekakae", 50));
        userRepository.save(new User(10L, "kaka5", 50));
        userRepository.save(new User(11L, "", 50));
        userRepository.save(new User(12L, null, 50));
        logger.info(String.valueOf(userRepository.findAll().size()));
        return "success";
    }

    //http://localhost:8888/user/delete?name=didi
    @GetMapping("delete")
    public String delete(String name){
        User u = userRepository.findByUsername(name).get(0);
        this.logger.info(u.toString());
        userRepository.delete(u);
        this.logger.info(String.valueOf(userRepository.findAll().size()));
        return u.toString();
    }

    //http://localhost:8888/user/query
    @GetMapping("query")
    public void query(){
        List<User> u1 = userRepository.findByUsernameLike("kaka");
        this.logger.info(u1.toString());
        List<User> u2 = userRepository.findByUsername("mama");
        this.logger.info(u2.toString());
        List<User> u3 = userRepository.findByAgeGreaterThan(40);
        this.logger.info(u3.toString());
        List<User> u4 = userRepository.findByAgeLessThan(40);
        this.logger.info(u4.toString());
        List<User> u5 = userRepository.findByAgeBetween(30,45);
        this.logger.info(u5.toString());
        List<User> u6 = userRepository.findByUsernameNotNull();
        this.logger.info(u6.toString());
        List<User> u7 = userRepository.findByUsernameNull();
        this.logger.info(u7.toString());
        List<User> u8 = userRepository.findByUsernameNot("kaka");
        this.logger.info(u8.toString());
    }

    //http://localhost:8888/user/query2
    @GetMapping("query2")
    public void query2(){
        Pageable pageable = PageRequest.of(0,10);
        Page<User> u1 = userRepository.findByNameAndAgeRange("kaka",50,pageable);
        this.logger.info(u1.toString());
        Page<User> u2 = userRepository.findByNameAndAgeRange2("kaka",0,50,pageable);
        this.logger.info(u2.toString());
        Page<User> u3 = userRepository.findByNameAndAgeRange3("kaka",0,50,pageable);
        this.logger.info(u3.toString());
    }



}
