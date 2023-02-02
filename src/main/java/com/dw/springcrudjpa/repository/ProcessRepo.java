package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.springcrudjpa.model.Process;

public interface ProcessRepo extends JpaRepository<Process, Long> {

}
