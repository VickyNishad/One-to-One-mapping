package com.student.service;

import org.springframework.stereotype.Component;

import com.student.entity.Student;

@Component
public interface ServiceInterface {

	public  Student addStudent(  Student student );

	public Student findByStudentId(long id);

}
