package com.jc.jdbcpoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.jc.jdbcpoc.utils.JDBCConstants;

public class InsertPreparedStatment {
	public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection(JDBCConstants.DB_URL, JDBCConstants.USR_NAME, JDBCConstants.PWD);
			PreparedStatement ps=con.prepareStatement("insert into parents values(?,?,?,?)");
			int executeUpdate=0;
			int records=0;
			for (int i = 0; i < 4; i++) {
				ps.setInt(1, 101+i);
				ps.setString(2, "Jons"+i);
				ps.setInt(3, 90909+i);
				ps.setString(4, "hons"+i+"@gmail.com");
				executeUpdate= ps.executeUpdate();
				records++;
			}
			System.out.println(records+" records");
		} catch (Exception e) {// TODO: handle exception
		}
	}

}
