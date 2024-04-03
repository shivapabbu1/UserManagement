package com.users.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.users.base.entity.User;
import com.users.base.services.UserService;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";  // Assuming "users" is the name of your HTML template
    }
    
    @GetMapping("/user/new")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "create_user";  // Assuming "create_user" is the name of your HTML template for creating a new user
    }
    
    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users"; // Redirect to the page displaying all users
    }
    @GetMapping("/users/edit/{id}")
    public String updateUserFrom(@PathVariable int id, Model model) {
    	 model.addAttribute("user", userService.getUserById(id));
    	return "edit_userform";
    }
    @PostMapping("/users/{id}")
    public String updateUser(@PathVariable Long id, @ModelAttribute("user") User user) {
    User existUser=	userService.getUserById(id);
    existUser.setId(id);
    existUser.setFirstname(user.getFirstname());
    existUser.setLastname(user.getLastname());
    existUser.setEmail(user.getEmail());
    userService.updateUser(existUser);
     return "redirect:/users";
    }
    
    @GetMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
     userService.deleteUserById(id);
     return "redirect:/users";

}
}