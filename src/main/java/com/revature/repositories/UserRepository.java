package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findUserByUsername(String userName);
	
}//end interface
