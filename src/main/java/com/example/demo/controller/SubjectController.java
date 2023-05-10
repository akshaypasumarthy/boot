package com.example.demo.controller;

import java.util.List;
import com.example.demo.bean.Subject;
import com.example.demo.service.SubjectService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectservice;
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects(){
	
		return subjectservice.getAllSubjects();
		
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/subjects",value="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subjectservice.addSubject(subject);
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/subjects/{bookCode}",value="/subjects/{bookCode}")
	public void updateSubject(@PathVariable Integer bookCode,@RequestBody Subject subject) {
		subjectservice.updateSubject(bookCode,subject);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/subjects/{id}",value="/subjects/{id}")
	public void DeleteSubject(@PathVariable Integer bookCode) {
		subjectservice.deleteSubject(bookCode);
	}
	
	
}
