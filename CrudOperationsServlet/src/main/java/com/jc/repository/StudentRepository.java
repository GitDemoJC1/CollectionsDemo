package com.jc.repository;

import java.sql.Statement;

import com.jc.jdbcpoc.utils.JdbcCons;
import com.jc.jdbcpoc.utils.StudentModel;

public class StudentRepository {

	public boolean saveStudent(StudentModel sModel) {
		String query = "insert into StudentReg values(" + "'"+sModel.getStudentName()+"','" + sModel.getStudentAge() + "','"
				+ sModel.getStudentGender() + "','" + sModel.getStudentCourse() + "','" + sModel.getStudentPhone() + "')";
		System.out.println(query);
		boolean execute =false;
		try {
			Statement smt = JdbcCons.getConnection();
			execute = smt.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return execute;
	}

}
