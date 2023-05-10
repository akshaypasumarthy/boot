package com.example.demo.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Subject;
import com.example.demo.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectrepo;
	
	public List<Subject> getAllSubjects(){
		
		List<Subject> subjects = new ArrayList<>();
		subjectrepo.findAll().forEach(subjects::add);
		return subjects;
		
	}

	public void addSubject(Subject subject) {
		subjectrepo.save(subject);
		
	}

	public void updateSubject(Integer bookCode, Subject subject) {
		subjectrepo.save(subject);
		// TODO Auto-generated method stub
		
	}

	public void deleteSubject(Integer bookCode) {
		// TODO Auto-generated method stub
		subjectrepo.deleteById(bookCode);
		
	}
	
	

}
