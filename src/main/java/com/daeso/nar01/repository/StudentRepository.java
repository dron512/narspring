package com.daeso.nar01.repository;

import com.daeso.nar01.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByClsAndGrade(int grade, int cls);
}
