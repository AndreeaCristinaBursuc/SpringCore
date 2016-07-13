package com.example.spring;

import com.example.spring.repository.impl.UserRepositoryImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by abursuc on 7/13/2016.
 */
@Component
public class UtilClass /*implements ApplicationContextAware*/{

    @Autowired
    private ApplicationContext applicationContext;


    public void displayMessage(){
        System.out.println("TEST");
        System.out.println(applicationContext.getBean(UserRepositoryImpl.class));
    }

    /*@Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }*/
}
