package com.users.base.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.users.base.entity.User;
import com.users.base.repository.UserRepo;
import com.users.base.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepo userRepo;
	

	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}


	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}


	@Override
	public User saveUser(User user) {
		
		return userRepo.save(user);
	}


	


	@Override
	public User updateUser(User user) {
		
		return userRepo.save(user);
	}




	@Override
	public User getUserById(long id) {
		
		return userRepo.findById(id).get();
	}


	@Override
	public void deleteUserById(long id) {
	userRepo.deleteById(id);
		
	}



}
