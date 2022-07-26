package com.jc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jc.model.LuckyDrawModel;

public class LuckyDrawRepoistory {

	public Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(JDBCConstants.DB_URL, JDBCConstants.USR_NAME, JDBCConstants.PWD);
		return con;
	}

	public int save(LuckyDrawModel lmodel) {
		int status = 0;
		try {
			Connection con = getConnection();
			boolean isTableAvailable = isTableAvailable(con, JDBCConstants.MAIN_TABLE);
			if (isTableAvailable == false) {
				createTable(con, JDBCConstants.MAIN_TABLE);
			}
			String query = "insert into " + JDBCConstants.MAIN_TABLE
					+ "(firstname, lastname, email, place, gender, createddate) values (?,?,?,?,?,CURRENT_TIMESTAMP)";
			PreparedStatement ps = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, lmodel.getFristName());
			ps.setString(2, lmodel.getLastName());
			ps.setString(3, lmodel.getEmailAddress());
			ps.setString(4, lmodel.getPlace());
			ps.setString(5, lmodel.getGender());
			status = ps.executeUpdate();
			if (status > 0) {
				ResultSet generatedKeys = ps.getGeneratedKeys();
				while (generatedKeys.next()) {
					status = generatedKeys.getInt(1);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public boolean isTableAvailable(Connection con, String table_name) throws SQLException {
		ResultSet rs = con.getMetaData().getTables(null, null, table_name, null);
		while (rs.next()) {
			String tableName = rs.getString("TABLE_NAME");
			System.out.println(tableName);
			if (table_name.equalsIgnoreCase(tableName)) {
				return true;
			}
		}
		return rs.next();
	}

	public void createTable(Connection con, String tableName) throws SQLException {
		Statement smt = con.createStatement();
		String SQl_QUERY = "CREATE TABLE " + tableName
				+ "(id SERIAL PRIMARY KEY,FirstName varchar(100),lastName varchar(100),email varchar(100), place varchar (100),gender varchar(100),CreatedDate timestamp)";
		smt.execute(SQl_QUERY);
	}

	public LuckyDrawModel serachById(Integer id) {
		LuckyDrawModel resModel = new LuckyDrawModel();
		try {
			Connection con = getConnection();
			String SQL_QUERY = "SELECT * FROM " + JDBCConstants.MAIN_TABLE + " where id =?::int4";
			PreparedStatement ps = con.prepareStatement(SQL_QUERY);
			ps.setInt(1, id);
			ResultSet executeQuery = ps.executeQuery();
			while (executeQuery.next()) {
				resModel.setId(executeQuery.getInt(1));
				resModel.setFristName(executeQuery.getString(2));
				resModel.setLastName(executeQuery.getString(3));
				resModel.setEmailAddress(executeQuery.getString(4));
				resModel.setPlace(executeQuery.getString(5));
				resModel.setGender(executeQuery.getString(6));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return resModel;
	}

	public List<LuckyDrawModel> getAllRecords() {
		List<LuckyDrawModel> lmodel = new ArrayList<LuckyDrawModel>();
		try {
			Connection con = getConnection();
			String SELECTQUERY = "select * from " + JDBCConstants.MAIN_TABLE;
			PreparedStatement ps = con.prepareStatement(SELECTQUERY);
			ResultSet records = ps.executeQuery();
			while (records.next()) {
				LuckyDrawModel model = new LuckyDrawModel();
				model.setId(records.getInt(1));
				model.setFristName(records.getString(2));
				model.setLastName(records.getString(3));
				model.setEmailAddress(records.getString(4));
				model.setPlace(records.getString(5));
				model.setGender(records.getString(6));
				lmodel.add(model);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lmodel;
	}

	public int deleteRecord(Integer id) {
		try {
			Connection con = getConnection();
			String DELETE_QUERY = "delete from " + JDBCConstants.MAIN_TABLE + " where id =?::int4";
			PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
			ps.setInt(1, id);
			int executeUpdate = ps.executeUpdate();
			return executeUpdate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updateRecord(LuckyDrawModel model) {
		try {
			Connection con = getConnection();
			String Update_Qyery = "update " + JDBCConstants.MAIN_TABLE
					+ " SET FirstName=?,lastname=?,email=?,place=?,gender=? where id=?::int4";
			PreparedStatement ps = con.prepareStatement(Update_Qyery);
			ps.setString(1, model.getFristName());
			ps.setString(2, model.getLastName());
			ps.setString(3, model.getEmailAddress());
			ps.setString(4, model.getPlace());
			ps.setString(5, model.getGender());
			ps.setInt(6, model.getId());
			int executeUpdate = ps.executeUpdate();
			return executeUpdate;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
}
