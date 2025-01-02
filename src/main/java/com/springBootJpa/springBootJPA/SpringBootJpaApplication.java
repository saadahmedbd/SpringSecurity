package com.springBootJpa.springBootJPA;

import com.springBootJpa.springBootJPA.model.Student;
import com.springBootJpa.springBootJPA.repository.studentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(studentRepository StudentRepository){
		return args -> {
			Student saad =new Student(
					"saad","ahmed","saadahmedbd0@gmail.com",21,"saad","saad123"
			);
			Student hridoy=new Student(
					"hridoy","hossen","hridoyhossen@gmail.com",21,"hridoy","hridoy123+"
			);
			StudentRepository.save(saad);
			StudentRepository.save(hridoy);
			StudentRepository.count();
		};
	}

}
