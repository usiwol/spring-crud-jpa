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
import com.dw.springcrudjpa.repository.CurriculumRepo;

@RestController
public class CurriculumController {
    
    @Autowired
    CurriculumRepo repo;

    //전체조회
    @GetMapping("api/v1/curriculum")
    public List<Curriculum> callAllCurriculum() {
        return repo.findAll();
    }

    // //추가
	@PostMapping("api/v1/curriculum")
    public Curriculum callSaveCurriculum(@RequestBody Curriculum curriculum) {
        //save == insert
        curriculum = repo.save(curriculum);
        return curriculum;
    }
    
    //삭제
	@DeleteMapping("api/v1/curriculum/{curriculumNum}")
    public boolean callDeleteCurriculum(@PathVariable long curriculumNum) {
        //deleteById == delete
        //By == where
        try {
            repo.deleteById(curriculumNum); //리턴타입이 void
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //상세 조회
	@GetMapping("api/v1/curriculum/{curriculumNum}")
    public Curriculum callCurriculumByCurriculumNum(@PathVariable long curriculumNum) {
        //findById(id) == select * from emp where empno = 333;
        return repo.findById(curriculumNum).get();
    }
    
    //수정
	@PatchMapping("api/v1/curriculum")
	public Curriculum updateCurriculum(@RequestBody Curriculum curriculum) {
		//save == update or insert
		//동일한 PK 값이 있으면 update!
		//동일한 PK 값이 없으면 insert!
		curriculum =repo.save(curriculum);
		return curriculum;
	}
}
