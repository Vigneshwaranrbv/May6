package com.example.May6.controller;

import com.example.May6.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"vignesh","cs"),
            new Student(2,"bhuvanesh","ece")
    ));

    @GetMapping("/students")
    public List<Student> getStudent(){
    return students;
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
}
