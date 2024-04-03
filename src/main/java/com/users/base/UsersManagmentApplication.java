package com.users.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.users.base.entity.User;
import com.users.base.repository.UserRepo;
import com.users.base.services.UserService;

@SpringBootApplication
public class UsersManagmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UsersManagmentApplication.class, args);
	}
  @Autowired
	 private UserRepo userRepo;
	@Override
	public void run(String... args) throws Exception {
		
		

	}

}
