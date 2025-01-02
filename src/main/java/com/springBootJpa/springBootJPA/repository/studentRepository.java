package com.springBootJpa.springBootJPA.repository;

import com.springBootJpa.springBootJPA.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,Long> {
    Student findByUsername(String username);

}
