package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.springcrudjpa.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
