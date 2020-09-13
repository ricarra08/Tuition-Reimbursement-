package com.revature.dao;


import java.sql.SQLException;
import java.util.List;
import com.revature.beans.Employee;

public interface EmployeeDAO {
	//Get Employee  from BobnSons employee database
	public Employee getEmployeeByEmail(String email) throws SQLException;
	
	//Employee Login credentials
	public Employee getEmployeeLogin(String email, String password);
	
	//Get all existing employees
	public List<Employee> getAllEmployees();
}
