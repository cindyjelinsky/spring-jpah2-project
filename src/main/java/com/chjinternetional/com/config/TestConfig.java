package com.chjinternetional.com.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.chjinternetional.com.entities.User;
import com.chjinternetional.com.repositories.UserRepository;

@Configuration
@Profile("test") //roda a configuração no perfil test declarado no application.properties
public class TestConfig implements CommandLineRunner {
	
	@Autowired  //cria a dependencia automatica dos objetos
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
