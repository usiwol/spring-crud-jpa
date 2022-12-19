package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.StudentRepo;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;
    
    //전체조회
    @GetMapping("api/v1/student")
    public List<Student> callAllStudent() {
        //findAll == select * from <테이블이름>
        return repo.findAll();
    }

    //추가
	@PostMapping("api/v1/student")
	public Student callSaveStudent(@RequestBody Student student) {
		//save == insert
		student = repo.save(student);
		return student;
	}
}
