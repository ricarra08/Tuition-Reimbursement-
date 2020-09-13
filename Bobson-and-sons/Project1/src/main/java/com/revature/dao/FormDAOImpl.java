package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.beans.Form;
import com.revature.util.ConnFactory;

public class FormDAOImpl implements FormDAO {

public static ConnFactory cu= ConnFactory.getInstance();
	
	public void  insertFormDetails(Form form, int employeeid) {
		Connection cnn = cu.getConnection();


		try{	
			String sql = "INSERT INTO formdetails (applicationid, formfirstname, formlastname, formeventname, formeventcost, formeventstartdate, formeventstarttime, formeventendtime, formeventaddress, formeventcity, formeventstate, formeventzip, formgradedformat, gradecutoff, formdescription) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";		
			PreparedStatement ps = cnn.prepareStatement(sql);
			
			ps.setInt(1, ReimbursementImpl.getApplicationID(employeeid)); //check
			ps.setString(2, form.getFormFirstName());
			ps.setString(3, form.getFormLastName());
			ps.setString(4, form.getFormEventName());
			ps.setInt(5, form.getFormEventCost());
			ps.setString(6, form.getFormEventStartDate());
			ps.setString(7, form.getFormEventStartTime());
			ps.setString(8, form.getFormEventEndTime());
			ps.setString(9, form.getFormEventAddress());
			ps.setString(10, form.getFormEventCity());
			ps.setString(11, form.getFormEventState());
			ps.setInt(12, form.getFormEventZip());
			ps.setString(13, form.getFormGradedFormat());
			ps.setString(14, form.getFormGradeCO());
			ps.setString(15, form.getFormDescription());
			
			ps.executeUpdate();
			 
		}catch (SQLException sqle) {
			sqle.printStackTrace();
	}
}



	public Form callFormDetails(int employeeid) {//fix this due to new variables
			Connection cnn = cu.getConnection();
			Form form = new Form();
			
			try{	
				String sql = "SELECT * FROM formdetails WHERE applicationid=(SELECT applicationId from reimbursement where employeeid= ?)";		
				PreparedStatement ps = cnn.prepareStatement(sql);
				ps.setInt(1, employeeid);
				
				
				ResultSet rs = ps.executeQuery();		
				
				while(rs.next()){
					
					form.setFormID(rs.getInt("formID"));
					form.setFormApplicationID(rs.getInt("applicationID"));
					form.setFormFirstName(rs.getString("formFirstName"));
					form.setFormLastName(rs.getString("formLastName"));
					form.setFormEventName(rs.getString("formEventName"));
					form.setFormEventCost(rs.getInt("formEventCost"));
					form.setFormEventStartDate(rs.getString("formEventStartDate"));
					form.setFormEventAddress(rs.getString("formEventAddress"));
					form.setFormEventCity(rs.getString("formEventCity"));
					form.setFormEventState(rs.getString("formEventState"));
					form.setFormEventZip(rs.getInt("formEventZip"));
					form.setFormGradedFormat(rs.getString("formGradedFormat"));
					form.setFormDescription(rs.getString("formDescription"));
		
				}
				
					
			}catch (SQLException sqle) {
				sqle.printStackTrace();
			}	
			return form;
		
		}





	}

	
	
