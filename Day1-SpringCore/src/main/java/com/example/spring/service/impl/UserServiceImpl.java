package com.example.spring.service.impl;

import java.util.List;
import java.util.Scanner;

import com.example.spring.UtilClass;
import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("service1")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRep;

	@Autowired
	private UtilClass utilClass;

	@Override
	public List<User> list() {
		utilClass.displayMessage();
		userRep.list();
		System.out.println("Sunt in Service in list();");
		return userRep.list();

	}

	@Override
	public User get(int id) {
		System.out.println("Sunt in Service in get().");
		return userRep.get(id);
	}

	@Override
	public void save(User user) {
		System.out.println("Sunt in Service in save().");
		userRep.save(user);
	}
}
