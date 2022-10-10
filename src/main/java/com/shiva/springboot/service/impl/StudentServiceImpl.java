package com.shiva.springboot.service.impl;

import com.shiva.springboot.controller.StudentRepository;
import com.shiva.springboot.domain.Student;
import com.shiva.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public String addStudent(Student student) {
        repository.save(student);
        return "Student added.";

    }

    @Override
    public Optional<Student> getStudentsById(int id) {
        return repository.findById(id);
    }

    @Override
    public String deleteStudentsById(int id) {
         repository.deleteById(id);
        return "Student Delete Successfully.";
    }
}
