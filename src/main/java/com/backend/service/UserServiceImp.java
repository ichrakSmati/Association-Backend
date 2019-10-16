package com.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.dao.UserRepository;
import com.backend.models.User;


@Service(value= "userService")
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}
}
