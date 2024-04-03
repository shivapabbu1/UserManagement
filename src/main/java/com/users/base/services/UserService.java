package com.users.base.services;

import java.util.List;

import com.users.base.entity.User;

public interface UserService {
  List<User> getAllUsers();
  
  User saveUser(User user);
  
  User getUserById(long id);
  
  User updateUser(User user);

   void deleteUserById(long id);
  
}

