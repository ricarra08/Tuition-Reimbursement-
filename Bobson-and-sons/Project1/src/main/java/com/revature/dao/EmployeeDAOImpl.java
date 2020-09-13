package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.util.ConnFactory;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	public static ConnFactory syscnn= ConnFactory.getInstance();

	@Override
	public Employee getEmployeeByEmail(String email) throws SQLException {
		
		Employee employee = null;
		try{
			Connection cnn = syscnn.getConnection();
			String sql = "select * from employee where email = ?";
			PreparedStatement ps = cnn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			
			while (rs.next()) {
				employee =  new Employee();
				
				employee.setEmployeeId(rs.getInt(""));;
				employee.setFirstName(rs.getString(""));
				employee.setLastName(rs.getString(""));
				employee.setReportsTo(rs.getInt(""));
				employee.setDH(rs.getBoolean(""));
				employee.setBenCo(rs.getBoolean(""));
				employee.setEmail(rs.getString(""));
				employee.setPassword(rs.getString(""));
			}		
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}
		return employee;
	}


	@Override
	public Employee getEmployeeLogin(String email, String password) {
		Employee employee = null;
				
		try(Connection cnn = syscnn.getConnection();){
			
			String sql = "select * from employee where email = ? and password = ?";
			PreparedStatement ps = cnn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();		
			
			if(rs.next()){
				employee = new Employee();
				
				employee.setEmployeeId(rs.getInt("employeeid"));;
				employee.setFirstName(rs.getString("firstname"));
				employee.setLastName(rs.getString("lastname"));
				employee.setReportsTo(rs.getInt("reportsto"));
				employee.setDH(rs.getBoolean("isdh"));
				employee.setBenCo(rs.getBoolean("isbenco"));
				employee.setEmail(rs.getString("email"));
				employee.setPassword(rs.getString("password"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}


	@Override
	public List<Employee> getAllEmployees() {
		
		ArrayList<Employee> employees = new ArrayList<>();
		try(Connection cnn = syscnn.getConnection();){
			
			String sql = "select * from employee where employeeid = ?";
			PreparedStatement ps = cnn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(sql);
			
			while(rs.next()) {
				Employee employee = new Employee();
				
				employee.setEmployeeId(rs.getInt("employeeid"));;
				employee.setFirstName(rs.getString("firstname"));
				employee.setLastName(rs.getString("lastname"));
				employee.setReportsTo(rs.getInt("reportto"));
				employee.setDH(rs.getBoolean("isdh"));
				employee.setBenCo(rs.getBoolean("isbenco"));
				employee.setEmail(rs.getString("email"));
				//employee.setPassword(rs.getString(""));
				employees.add(employee);
			}
			
		} catch(SQLException sqle) {
			sqle.printStackTrace();
		}		
		return employees ;
	}
}
