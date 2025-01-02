package com.springBootJpa.springBootJPA.service;

import com.springBootJpa.springBootJPA.model.Student;
import com.springBootJpa.springBootJPA.model.userPrincipal;
import com.springBootJpa.springBootJPA.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService implements UserDetailsService {
    @Autowired
    public studentRepository StudentRepository;
    public List<Student> getAllStudent(){
        return StudentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return StudentRepository.findById(id).orElse(null);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Student student=StudentRepository.findByUsername(username);
        if (student == null){
            System.out.println("user not found");
            throw  new UsernameNotFoundException("user not found");
        }
        return new userPrincipal(student);
    }

}
