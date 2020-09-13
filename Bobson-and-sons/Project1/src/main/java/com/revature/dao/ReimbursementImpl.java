package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.revature.beans.Form;
import com.revature.beans.Reimbursement;
import com.revature.util.ConnFactory;

public class ReimbursementImpl implements ReimbursementDAO{
	
	public static ConnFactory cu= ConnFactory.getInstance();
	
	@Override
	public ArrayList<Reimbursement> getAllReimbursements() {
		Connection cnn = cu.getConnection();
		ArrayList<Reimbursement> tickets = new ArrayList<Reimbursement>();
		
		try {
			
			String sql = "select * from reimbursement";
			PreparedStatement ps = cnn.prepareStatement(sql);	
			ResultSet rs = ps.executeQuery(sql);
			
			while(rs.next()){
				Reimbursement temp = new Reimbursement();
				
				temp.setApplicationid(rs.getInt(" "));
				temp.setSubmittedon(rs.getString(" "));
				temp.setEmployeeid(rs.getInt(" "));
				temp.setEducationtypeid(rs.getInt(" "));
				temp.setUrgent(rs.getBoolean(" "));
				
				tickets.add(temp);
			}
			return tickets;
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}	
		return tickets;
	}
	
	/*
	 * Come edit this implementation 
	 * will cause problems later
	 */
	@Override
	public ArrayList<Reimbursement> getReimbursementsByUrgency(boolean urgent) {
		ArrayList<Reimbursement> tickets = new ArrayList<Reimbursement>();
		
		try (Connection cnn = cu.getConnection()){
	
			String sql = "select * from reimbursement where urgent = true order by submittedon";	
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			
			while(rs.next()){
				Reimbursement temp = new Reimbursement();
				
				temp.setApplicationid(rs.getInt(" "));
				temp.setSubmittedon(rs.getString(" "));
				temp.setEmployeeid(rs.getInt(" "));
				temp.setEducationtypeid(rs.getInt(" "));
				temp.setUrgent(rs.getBoolean(" "));
				
				tickets.add(temp);
			}
			return tickets;
			
		}catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return tickets;
	}
	
	@Override
	public void	insertNewReimbursement(int employeeid,String educationtype) {
		Connection cnn = cu.getConnection();
		String sql = "INSERT INTO reimbursement (employeeid , educationtype) VALUES (?,?)";
		
		try {
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1, employeeid);
			ps.setString(2, educationtype);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public boolean updateReimbursment(int applicationid, String submittedon, int employeeid, int educationtypeid, boolean urgent) throws SQLException {
		Connection cnn = cu.getConnection();
		String sql = "insert into \"Reimbursement\" (\"applicationid\", \"submittedon\", \"employeeid\", \"educationtypeid\", \"urgent\")  values(?,?,?,?)";
		PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setInt(1, applicationid);
			ps.setString(2,submittedon);
			ps.setInt(3, employeeid);
			ps.setInt(4, educationtypeid);
			ps.setBoolean (5, urgent);
			
			if(ps.executeUpdate() != 0) {
				return true;
			}else {
				return false;
			}
	}

	@Override
	public boolean deleteReimbursement(int applicationid) {
		
		try(Connection cnn = cu.getConnection();){
			
			String sql = "DELETE * FROM Reimbur WHERE reimb_id = ?";		
			PreparedStatement pstmt = cnn.prepareStatement(sql);
			pstmt.setInt(1, applicationid);
			cnn.commit();
			
			if(pstmt.executeUpdate() != 0) {
				return true;
			}else {
				return false;
			}
			
				
		}catch (SQLException sqle) {
			sqle.printStackTrace();
		}	
		return false;
	}
	
	public static int getApplicationID(int employeeid) {
		
		Reimbursement currentApplicationID = new Reimbursement();
		Connection cnn = cu.getConnection();
		
		
		try {
		String sql = "SELECT applicationid FROM reimbursement WHERE employeeid = ?";
		PreparedStatement ps = cnn.prepareStatement(sql);
		ps.setInt(1 , employeeid);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			
			
			currentApplicationID.setApplicationid(rs.getInt("applicationID"));
		}
		
		}catch (SQLException sqle) {
			sqle.printStackTrace();
			
		}
		
		int currentAppID = currentApplicationID.getApplicationid();
		
		return  currentAppID;
	}

	
	
		
}
	
	


