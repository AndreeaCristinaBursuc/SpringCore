package com.example.spring.controller;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import com.example.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@Controller
public class UserController {

	@Qualifier(value="service2")
	@Autowired
	private UserService user_srv;



	public void createUser(User user){
		// call UserService here
		user.setFirstName("Andreea");
		user.setLastName("Bursuc");
		user.setId(1234);
		user.setAge(22);
		user_srv.save(user);
		user_srv.list();

		Scanner sc=new Scanner(System.in);
		System.out.println("Dati un id!");
		String answ=sc.nextLine();
		User u=user_srv.get(Integer.parseInt(answ));
		//u.getFirstName();

	}

	@PostConstruct
	public void firstMethod(){
		System.out.println("S-a apelat PostConstruct mai intai !");
	}
}
