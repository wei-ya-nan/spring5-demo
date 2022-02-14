package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@RestController
public class UserController {
    //注入service
    @Autowired
    private UserService service;

    //id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable int id) {
        return service.getUserById(id);
    }

    //查询所有
    @GetMapping("/user")
    public Flux<User> getUsers(){
        return service.getAllUser();
    }

    //添加所有
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@PathVariable User user){
        Mono<User> userMono = Mono.just(user);
        return service.saveUserInfo(userMono);
    }

}
