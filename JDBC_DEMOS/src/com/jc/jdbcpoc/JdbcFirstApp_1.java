package com.jc.jdbcpoc;

import java.sql.SQLException;
import java.sql.Statement;

import com.jc.jdbcpoc.utils.JdbcCons;

public class JdbcFirstApp_1 {
	public static void main(String[] args) {
		// we need to add driver
		String sqlQuery = "CREATE TABLE Parents (parentId int,firstName varchar(255),phone int,mail varchar(255))";
		try {
			Statement smt = JdbcCons.getConnection();
			smt.execute(sqlQuery);
			System.out.println("table is Created");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
