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

import com.dw.springcrudjpa.model.Curriculum;
import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.CurriculumRepo;
import com.dw.springcrudjpa.repository.StudentRepo;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @Autowired
    CurriculumRepo curriculumRepo;
    //전체조회
    @GetMapping("api/v1/student")
    public List<Student> callAllStudent() {
        //findAll == select * from <테이블이름>
        return repo.findAll();
    }

    //상세 조회
	@GetMapping("api/v1/student/{studentNum}")
    public Student callStudentByStudentNum(@PathVariable long studentNum) {
        //findById(id) == select * from emp where empno = 333;
        return repo.findById(studentNum).get();
    }

    //수정
	@PatchMapping("api/v1/student")
    public Student updateStudent(@RequestBody Student student) {
        //save == update or insert
        //동일한 PK 값이 있으면 update!
        //동일한 PK 값이 없으면 insert!
        student = repo.save(student);
        return student;
    }
    
    //student 수정 창에서 과정선택하기
   @GetMapping("api/v1/student/select")
   public List<Curriculum> callCrudCurriculum() {
      return curriculumRepo.findAll();
   }

    //추가
	@PostMapping("api/v1/student")
    public Student callSaveStudent(@RequestBody Student student) {
        //save == insert
        student = repo.save(student);
        return student;
    }
    
        //삭제
	@DeleteMapping("api/v1/student/{studentNum}")
    public boolean callDeleteStudent(@PathVariable long studentNum) {
        //deleteById == delete
        //By == where
        try {
            repo.deleteById(studentNum); //리턴타입이 void
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
