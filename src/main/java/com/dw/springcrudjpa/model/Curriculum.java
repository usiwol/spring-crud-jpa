package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "crud_curriculum")
public class Curriculum {

    @Id
    @Column(name="curriculum_num")
    private long curriculumNum; //과정번호(pk)
    @Column
    private String curriculumName; //과정이름
    @Column
    private String curriculumRoom; //과정호실
    @Column
    private String curriculumStartPeriod; //과정시작기간
    @Column
    private String curriculumEndPeriod; //과정종료기간
    @Column
    private String curriculumTeacher; //담당교사
    
}
