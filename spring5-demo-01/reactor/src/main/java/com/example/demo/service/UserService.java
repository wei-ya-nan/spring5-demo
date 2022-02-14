package com.example.demo.service;

import com.example.demo.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public interface UserService {
    //根据id查询用户
    Mono<User> getUserById(int id);
    //查询所有的用户
    Flux<User> getAllUser();
    //添加用户
    Mono<Void> saveUserInfo(Mono<User> userMono);

}

