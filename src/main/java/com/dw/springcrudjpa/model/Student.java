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

@Getter
@Setter

@Entity
@Table(name = "dw_student")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "student_number")
  private long studentNumber;
  @Column(name = "student_name")
  private String studentName;
  @Column(name = "student_age")
  private int studentAge;
  @Column(name = "student_tel")
  private String studentTel;
  @Column(name = "student_addr")
  private String studentAddr;

  @ManyToOne
  @JoinColumn(name = "process_number")
  private Process processNumber;
}
