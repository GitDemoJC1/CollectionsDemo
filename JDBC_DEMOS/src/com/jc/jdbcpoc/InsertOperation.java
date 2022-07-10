package com.jc.jdbcpoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jc.jdbcpoc.utils.JDBCConstants;

public class InsertOperation {
	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		System.out.println("==========================");
		String inserSqlQuery_0="insert into student values(1,'Bhargavi',98989898,'bhar@outlook.com')";
		String inserSqlQuery_1="insert into student values(2,'Ashok',979789797,'ashok@outlook.com')";
		String inserSqlQuery_2="insert into student values(3,'Swathi',900000098,'swan@outlook.com')";
		String inserSqlQuery_3="insert into student values(4,'Jhonny',777777777,'jhon@outlook.com')";
		List<String> queries=new ArrayList<String>();
		queries.add(inserSqlQuery_0);
		queries.add(inserSqlQuery_1);
		queries.add(inserSqlQuery_2);
		queries.add(inserSqlQuery_3);
		
		try {
			Connection con = DriverManager.getConnection(JDBCConstants.DB_URL, JDBCConstants.USR_NAME,
					JDBCConstants.PWD);
			Statement smt = con.createStatement();
			for (String query:queries) {
				smt.execute(query);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
