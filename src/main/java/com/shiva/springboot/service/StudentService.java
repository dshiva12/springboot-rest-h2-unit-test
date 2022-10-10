package com.shiva.springboot.service;

import com.shiva.springboot.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
     List<Student> getStudents() ;

     String addStudent(Student student);

    Optional<Student> getStudentsById(int id);

    String deleteStudentsById(int id);
}
