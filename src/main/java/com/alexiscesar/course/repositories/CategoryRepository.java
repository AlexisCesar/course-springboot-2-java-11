package com.alexiscesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexiscesar.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
