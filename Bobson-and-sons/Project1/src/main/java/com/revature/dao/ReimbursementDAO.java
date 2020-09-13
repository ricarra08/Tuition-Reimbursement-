package com.revature.dao;

import java.sql.SQLException;
import java.util.ArrayList;


import com.revature.beans.Form;
import com.revature.beans.Reimbursement;

public interface ReimbursementDAO {
	
	ArrayList<Reimbursement> getAllReimbursements();
	
	ArrayList<Reimbursement> getReimbursementsByUrgency(boolean urgent);
	
	//ArrayList<Reimbursement> getReimbursementsByStatus(int status);
	
	public void insertNewReimbursement(int employeeid, String educationtype);
	
	public boolean updateReimbursment(int applicationid, String submittedon, int employeeeid, int educationtypeid, boolean urgent) throws SQLException;
	
	public boolean deleteReimbursement(int applicationid);
	
	public static int getApplicationID(int employeeid) {
		return 0;
	}
	
	
}
