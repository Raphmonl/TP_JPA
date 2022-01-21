package com.example.demo;

import com.example.demo.Model.*;
import com.example.demo.Repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TpApplication {

	@Autowired
	RentRepository rentRepository;

	public static void main(String[] args) {
		SpringApplication.run(TpApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo() {
		return (args) -> {

			Person ouioui = new Person("Ouioui");

			Car c1 = new Car("22BB33", 4);

			Rent rent = new Rent("01-01-2020", "31-12-2020", c1, ouioui);
			ouioui.getRents().add(rent);
			c1.getRents().add(rent);
			rentRepository.save(rent);
		};
	}

}

