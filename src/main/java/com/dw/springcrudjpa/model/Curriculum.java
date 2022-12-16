package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "curriculum_num")
    private int CurriculumNum; //과정번호(pk)
    @Column
    private String CurriculumName; //과정이름
    @Column
    private String CurriculumRoom; //과정호실
    @Column
    private String CurriculumPeriod; //과정기간
    @Column
    private String CurriculumTeacher; //담당교사
}
