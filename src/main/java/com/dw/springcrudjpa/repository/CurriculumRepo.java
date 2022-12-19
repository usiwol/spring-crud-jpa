package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.springcrudjpa.model.Curriculum;

//JAP를 상속밥는다
//@Mapper를 사용하지 않는다
public interface CurriculumRepo extends JpaRepository<Curriculum, Long>{
    
}
