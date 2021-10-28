package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Dio",
                        LocalDate.of(1868, Month.APRIL,12),
                        "kono.dio@gmail.com",
                        121


                )
        );
    }
}
