package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	private List<User> list = new ArrayList<User>();

	@Override
	public List<User> list() {
		System.out.println("Sunt in UserRepository in list();");
		for(User user:list){
			System.out.println(user.getFirstName());
			System.out.println(user.getId());
		}
		return list;
	}

	@Override
	public User get(int id) {
		System.out.println("Sunt in UserRepository in get();");
		int flag=0;
		for(User u:list){
			if(u.getId()==id){
				return u;
			}
		}
		return null;

	}

	@Override
	public void save(User user) {
		System.out.println("Sunt in UserRepository in save();");
		list.add(user);
	}

}
