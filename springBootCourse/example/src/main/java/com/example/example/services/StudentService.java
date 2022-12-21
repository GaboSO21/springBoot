package com.example.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.example.domain.Student;
import com.example.example.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }

}
