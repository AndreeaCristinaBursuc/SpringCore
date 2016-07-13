package com.example.spring.service.impl;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by abursuc on 7/13/2016.
 */

@Component("service2")
public class UserServiceImpl2 implements UserService {
    @Autowired
    UserRepository user_rep;

    @Override
    public List<User> list() {
        System.out.println("Sunt in SERVICE2 in list()");
        return null;
    }

    @Override
    public User get(int id) {
        System.out.println("Sunt in SERViCE2 in get()");
        return null;
    }

    @Override
    public void save(User user) {
        System.out.println("Sunt in SERVUCE2 in save()");

    }



}
