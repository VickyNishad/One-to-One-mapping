package com.student.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "student")
public class Student {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="id")
	 private long studentId;
	 
	 @Column(name ="studentname")
	 private String Name;
	 
	 @Column(name="studentaddress")
	 private String Address;
	 
	 @Column(name="DOB")
	 private String DOB;
	 
	 @Column(name = "Stream")
	 private String IT;
	 
	 @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
	 @JsonManagedReference
	 private Course course;
	 

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
	// students entity class getter setter
	public long getId() {
		return studentId;
	}

	public void setId(long id) {
		studentId = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getIT() {
		return IT;
	}

	public void setIT(String iT) {
		IT = iT;
	}

	 
	 
}
