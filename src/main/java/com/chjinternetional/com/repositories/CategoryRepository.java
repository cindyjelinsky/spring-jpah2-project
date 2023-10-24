package com.chjinternetional.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chjinternetional.com.entities.Category;

//JPA ja implementa interfaces automaticamnte


public interface CategoryRepository extends JpaRepository<Category, Long> {
				

	
}
