package com.springBootJpa.springBootJPA.controller;

import com.springBootJpa.springBootJPA.model.Student;
import com.springBootJpa.springBootJPA.repository.studentRepository;
import com.springBootJpa.springBootJPA.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    public studentService StudentService;
    @GetMapping()
    public List<Student> getAllStudent(){
        return StudentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
        return StudentService.getStudentById(id);
    }

}
