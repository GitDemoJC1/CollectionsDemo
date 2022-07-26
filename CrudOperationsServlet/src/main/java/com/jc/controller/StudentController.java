package com.jc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jc.jdbcpoc.utils.StudentModel;
import com.jc.service.StudentService;

public class StudentController extends HttpServlet {

	private StudentService studentService;

	public StudentController() {
		studentService = new StudentService();
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response
		PrintWriter pw = response.getWriter();
		response.setContentType("Text/HTML");
		//object for pojo
		StudentModel sModel = new StudentModel();
		//reading data from browser and set values Pojo
		sModel.setStudentName(request.getParameter("SName"));
		sModel.setStudentAge(request.getParameter("SAge"));
		sModel.setStudentGender(request.getParameter("SGender"));
		sModel.setStudentCourse(request.getParameter("SCourse"));
		sModel.setStudentPhone(request.getParameter("SPhone"));
		
		boolean isRegStud = studentService.regStud(sModel);
		if (isRegStud==false) {
			pw.print("<h1 style='color:red;'>Student Registartion is failed</h1>");
		}else {
			pw.print("<h1 style='color:green;'>Student Registartion is Success</h1>");
		}
	
	}

}
