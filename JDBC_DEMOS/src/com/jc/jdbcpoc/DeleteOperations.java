package com.jc.jdbcpoc;

import java.sql.Statement;

import com.jc.jdbcpoc.utils.JdbcCons;

public class DeleteOperations {
	public static void main(String[] args) {
		String delQuery="Delete from student where studentid=1";
		try {
			Statement stmt = JdbcCons.getConnection();
			boolean execute = stmt.execute(delQuery);
			if (execute) {
				System.out.println("Delete record success");
			}else {
				System.out.println("delete failed");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
	}

}
