package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.model.Process;
import com.dw.springcrudjpa.repository.ProcessRepo;
import com.dw.springcrudjpa.repository.StudentRepo;

@RestController
public class MainController {

  @Autowired
  StudentRepo studentrepo;

  @Autowired
  ProcessRepo processrepo;

  // 학생 모두 불러오기
  @GetMapping("/student")
  public List<Student> callAllStudent() {
    return studentrepo.findAll();
  }

  // 상세 조회
  @GetMapping("/student/{id}")
  public Student callDetailStudent(@PathVariable long id) {
    return studentrepo.findById(id).get();
  }

  // 학생 추가
  @PostMapping("/student")
  public Student callSaveMember(@RequestBody Student student) {
    student = studentrepo.save(student);
    return student;
  }

  // 학생 삭제
  @DeleteMapping("/student/{number}")
  public boolean callDeleteStudent(@PathVariable Long number) {
    try {
      studentrepo.deleteById(number);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  // 학생 정보 수정
  @PatchMapping("/student")
  public Student updateStudent(@RequestBody Student student) {
    student = studentrepo.save(student);
    return student;
  }

  // 과정 불러오기
  @GetMapping("/process")
  public List<Process> callAllProcess() {
    return processrepo.findAll();
  }

  // 과정 추가
  @PostMapping("/process")
  public Process callAddProcess(@RequestBody Process process) {
    return processrepo.save(process);
  }

  // 상세 조회
  @GetMapping("/process/{id}")
  public Process callDetailProcess(@PathVariable long id) {
    return processrepo.findById(id).get();
  }

  // 과정 삭제
  @DeleteMapping("/process/{number}")
  public boolean callDeleteProcess(@PathVariable Long number) {
    try {
      processrepo.deleteById(number);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  // 과정 정보 수정
  @PatchMapping("/process")
  public Process updateProcess(@RequestBody Process process) {
    process = processrepo.save(process);
    return process;
  }

}
