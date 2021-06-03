package com.alexiscesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexiscesar.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
