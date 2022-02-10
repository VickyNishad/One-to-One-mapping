package com.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Course;
import com.student.entity.Student;
import com.student.repository.StudentsRepo;
import com.student.service.ServiceInterface;

@Service
public class StudentServiceImpl implements ServiceInterface {
	
	@Autowired
	private StudentsRepo studentsRepo;

	
//	public Student  FindByStudentId(long studentId) {
//		Student student = studentsRepo.findByStudentId(studentId);
//		return student;
//	}


	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Course course = student.getCourse();
		course.setStudent(student);
		student = studentsRepo.save(student);
		
		return student;
	}


	@Override
	public Student findByStudentId(long id) {
		// TODO Auto-generated method stub
		Student student = studentsRepo.findByStudentId(id);
		return student;
	}
}





//
//public Book saveBook(Book book) {
//    Story story = book.getStory();
//    story.setBook(book);
//    book = bookRepository.save(book);
//    return book;
//}

