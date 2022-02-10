package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;

public interface StudentsRepo extends JpaRepository<Student, Long> {
	public Student findByStudentId(long StudentsId);

}
