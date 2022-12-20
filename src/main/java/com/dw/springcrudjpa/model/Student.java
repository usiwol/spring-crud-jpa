package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

//테이블이름은 소문자로
@Entity
@Table(name = "crud_student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long studentNum; //학생번호(pk)
    @Column(length = 30)
    private String studentName; //학생이름
    @Column
    private int studentAge; //학생나이
    @Column
    private String studentPhone; //학생연락처
    @Column
    private String address; //주소

    // @JoinColumn => member테이블에 dept_id라는 컬럼(FK)생성
	@ManyToOne
	@JoinColumn(name = "curriculumNum")
	private Curriculum curriculum;
}
