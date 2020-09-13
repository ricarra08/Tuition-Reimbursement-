package com.revature.dao;

import com.revature.beans.Form;

public interface FormDAO {
	
	public void insertFormDetails(Form form, int employeeid);
	
	public Form callFormDetails(int applicationid);
}
