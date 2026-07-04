package com.example.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepository extends JpaRepository<Student,Integer> {
}
