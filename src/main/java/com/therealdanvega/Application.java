package com.therealdanvega;

import com.therealdanvega.domain.User;
import com.therealdanvega.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRepository userRepository){
	    return args -> {
	        userRepository.save( new User("Sam", 20) );
	        userRepository.save( new User("Joe", 25) );
	        userRepository.save( new User("Mark", 48) );
	        userRepository.save( new User("Emily", 26) );
	        userRepository.save( new User("Nick", 59) );
	    };
	}

}
