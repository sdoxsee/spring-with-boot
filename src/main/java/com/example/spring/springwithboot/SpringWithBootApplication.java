package com.example.spring.springwithboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithBootApplication implements CommandLineRunner {

	@Autowired
	private FooRepository fooRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringWithBootApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Foo s = new Foo();
		s.setBar("BBD bar");
		Foo foo = fooRepository.saveAndFlush(s);
	}
}
