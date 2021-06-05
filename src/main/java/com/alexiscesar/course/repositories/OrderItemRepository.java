package com.alexiscesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexiscesar.course.entities.OrderItem;
import com.alexiscesar.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
	
}
