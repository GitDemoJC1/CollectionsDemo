package com.jc.jdbcpoc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jc.jdbcpoc.utils.JdbcCons;

public class readOperation {
	public static void main(String[] args) {
		String selectQuery = "Select * from student";
		try {
			Statement smt = JdbcCons.getConnection();
			ResultSet rs = smt.executeQuery(selectQuery);
			System.out.println("All Student Records");
			while (rs.next()) {
				System.out.print("Student ID::" + rs.getInt(1)+"   ");
				System.out.print("Student Name::" + rs.getString(2)+" ");
				System.out.print("Student phone::" + rs.getInt(3)+" ");
				System.out.print("Student Mail::" + rs.getString(4)+" ");
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
