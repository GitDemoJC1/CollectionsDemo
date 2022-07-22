package com.jc.service;

import com.jc.jdbcpoc.utils.StudentModel;
import com.jc.repository.StudentRepository;

public class StudentService {
	private StudentRepository studentRepository;

	public StudentService() {
		studentRepository = new StudentRepository();
	}

	public boolean regStud(StudentModel sModel) {
		return studentRepository.saveStudent(sModel);
	}

}
