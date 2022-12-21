package com.example.example.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.example.domain.Student;
import com.example.example.repository.StudentRepository;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student Gabriel = new Student("Gabriel", "gso2090@gmail.com", LocalDate.of(2003, 02, 21));
            Student Alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2002, 03, 22));

            studentRepository.saveAll(List.of(Gabriel, Alex)); 

        };
    }

}
