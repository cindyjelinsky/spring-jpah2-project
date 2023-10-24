package com.chjinternetional.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chjinternetional.com.entities.Product;

//JPA ja implementa interfaces automaticamnte


public interface ProductRepository extends JpaRepository<Product, Long> {
				

	
}
