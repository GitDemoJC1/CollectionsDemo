package com.jc.jdbcpoc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCons {
	public static Statement getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(JDBCConstants.DB_URL, JDBCConstants.USR_NAME, JDBCConstants.PWD);
		Statement smt = con.createStatement();
		return smt;
	}

}
