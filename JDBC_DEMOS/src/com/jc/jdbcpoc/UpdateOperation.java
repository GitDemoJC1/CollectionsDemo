package com.jc.jdbcpoc;

import java.sql.Statement;

import com.jc.jdbcpoc.utils.JdbcCons;

public class UpdateOperation {
	public static void main(String[] args) {
			System.out.println("Update operations");
			String updateSQlQuery="Update student set mail='Ashok@gmail.com' where firstName='Ashok'";
			try {
				JdbcCons.getConnection().execute(updateSQlQuery);
			} catch (Exception e) {
				
			}
	}
}
