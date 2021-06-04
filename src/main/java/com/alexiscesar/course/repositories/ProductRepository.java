package com.alexiscesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexiscesar.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
