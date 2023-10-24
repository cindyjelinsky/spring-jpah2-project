package com.chjinternetional.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chjinternetional.com.entities.Category;
import com.chjinternetional.com.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	

}
