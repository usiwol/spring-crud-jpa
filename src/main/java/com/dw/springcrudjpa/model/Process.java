package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "dw_process")
public class Process {

  @Id
  @Column(name = "process_number")
  private long processNumber;
  @Column(name = "process_name")
  private String processName;
  @Column(name = "process_class")
  private String processClass;
  @Column(name = "process_period")
  private String processPeriod;
  @Column(name = "process_teacher")
  private String processTeacher;
}
