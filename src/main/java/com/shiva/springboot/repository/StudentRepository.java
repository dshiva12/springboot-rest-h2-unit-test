package com.shiva.springboot.repository;

import com.shiva.springboot.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student ,Integer> {
}
