package com.users.base.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.users.base.entity.User;




public interface UserRepo extends JpaRepository<User, Long>  {

}