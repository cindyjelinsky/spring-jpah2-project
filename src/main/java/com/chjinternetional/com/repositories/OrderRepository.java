package com.chjinternetional.com.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.chjinternetional.com.entities.Order;

//JPA ja implementa interfaces automaticamnte


public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
				
