package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
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