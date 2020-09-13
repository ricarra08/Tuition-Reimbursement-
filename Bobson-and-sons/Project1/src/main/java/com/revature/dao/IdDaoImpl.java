package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Id;
import com.revature.util.ConnFactory;

public class IdDaoImpl implements IdDao{
	public static ConnFactory cf= ConnFactory.getInstance();
	
	public List<Id> getAllId() throws SQLException {
		List<Id> accList=new ArrayList<Id>();
		Connection conn= cf.getConnection();
		String sql = "select * from testtable";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		Id a=null;
		while(rs.next()) {
			a= new Id(rs.getString(1));
			accList.add(a);
		}
		return accList;
	}
	
	public void insertId(String id) throws SQLException {
		
		Connection conn = cf.getConnection();
        String sql = "INSERT INTO \"testtable\" values(?)";
		PreparedStatement pstmt = conn.prepareStatement(sql); 
        pstmt.setString(1, id);
        pstmt.executeUpdate();
	}
	public static void main(String[] args) {
		IdDaoImpl idi = new IdDaoImpl();
	
	try {
		System.out.println(idi.getAllId());
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
