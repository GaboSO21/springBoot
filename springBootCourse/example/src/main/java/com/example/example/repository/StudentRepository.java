package com.example.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.example.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
