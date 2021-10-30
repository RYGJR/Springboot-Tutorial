package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student dio = new Student(
                    "Dio",
                    LocalDate.of(1868, Month.APRIL,12),
                    "kono.dio@gmail.com",
                    121
            );
            Student jonathan = new Student(
                    "jonathan",
                    LocalDate.of(1868, Month.APRIL,4),
                    "jonasanjoestar@gmail.com",
                    20
            );
            repository.saveAll(
                    List.of(dio,jonathan)
            );
        };
    }

}
