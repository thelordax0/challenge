package com.thelordax0.challenger;




import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class ChallengerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengerApplication.class, args);
		System.out.println("Server running on 8080 PORT.");

	}

@Bean
public ModelMapper getModelMapper(){
	return new ModelMapper();
}

}
