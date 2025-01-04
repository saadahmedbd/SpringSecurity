package com.springBootJpa.springBootJPA.controller;

import com.springBootJpa.springBootJPA.model.Student;
import com.springBootJpa.springBootJPA.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/register")
    public Student userRegister(@RequestBody Student student){
//
        return StudentService.userRegister(student);
    }

    @PostMapping("/login")
    public String userLogin(@RequestBody Student student){
        return StudentService.verify(student);
    }

}
