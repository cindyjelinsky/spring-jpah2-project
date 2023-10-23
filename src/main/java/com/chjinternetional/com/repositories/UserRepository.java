package com.chjinternetional.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chjinternetional.com.entities.User;

//JPA ja implementa interfaces automaticamnte


public interface UserRepository extends JpaRepository<User, Long> {
				

	
}
