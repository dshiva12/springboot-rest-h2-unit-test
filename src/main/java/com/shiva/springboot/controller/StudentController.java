package com.shiva.springboot.controller;

import com.shiva.springboot.domain.Student;
import com.shiva.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/student")
    public List<Student>  getStudents(){
        return service.getStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentsById(@PathVariable int id){
        return service.getStudentsById(id);
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public String removeStudents(@PathVariable int id){
        return service.deleteStudentsById(id);
    }

}
