package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.ServiceInterface;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	
	@Autowired
	private ServiceInterface serviceInterface;
	
	@GetMapping("/{id}")
	public Student  FindById(@PathVariable long id) {
		Student responeStudent = serviceInterface.findByStudentId(id);
		return responeStudent;
		
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
		
	}
	
	
	
	@PostMapping("/student")
	public Student  addStudent(@RequestBody Student student) {
		Student addStudent = serviceInterface.addStudent(student);
		return addStudent;
	}
	
	
	
}





//@RequestMapping(value = "/savebook", method = RequestMethod.POST)
//@ResponseBody
//public Book saveBook(@RequestBody Book book) {
//    Book bookResponse = bookService.saveBook(book);
//    return bookResponse;
//}
