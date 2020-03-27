package com.project.LoggingMan.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LoggingMan.model.User;

public interface userRepository extends JpaRepository<User, String>
{
	List<User> findByName(String name);
	List<User> findByEmail(String email);
	List<User> findByPassword(String password);
	
	boolean existsByEmail(String email);
	boolean existsByPassword(String password);
	
}
