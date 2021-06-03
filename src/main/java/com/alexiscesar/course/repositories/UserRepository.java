package com.alexiscesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexiscesar.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
