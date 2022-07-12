package com.jc.jdbcpoc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.jc.jdbcpoc.utils.JDBCConstants;
import com.jc.jdbcpoc.utils.JdbcCons;

public class CrudOperations {

	public void createTable(String tableName, String[] columns) throws SQLException {
		String sqlQuery = "CREATE TABLE " + tableName + "(" + columns[0] + " int," + columns[1] + " varchar(255),"
				+ columns[2] + " int," + columns[3] + " varchar(255))";
		Statement smt = JdbcCons.getConnection();
		smt.execute(sqlQuery);
	}

	public int insertMobiles(String tableName,int mobileId, String mobileName, int mobilesCount, String mobileType) throws SQLException {
		String SqlQuery="insert into "+tableName+" values(?,?,?,?)";
		Connection con = DriverManager.getConnection(JDBCConstants.DB_URL, JDBCConstants.USR_NAME, JDBCConstants.PWD);
		PreparedStatement ps = con.prepareStatement(SqlQuery);
		ps.setInt(1, mobileId);
		ps.setString(2, mobileName);
		ps.setInt(3, mobilesCount);
		ps.setString(4, mobileType);
		return ps.executeUpdate();
	}

}
