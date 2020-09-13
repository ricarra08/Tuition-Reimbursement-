package com.revature.beans;

public class Employee {


	private int EmployeeId;
	private String firstName;
	private String lastName;
	private int reportsTo;
	private boolean isDH;
	private boolean isBenCo;
	private String email;
	private String password;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstName, String lastName, int reportsTo, boolean isDH, boolean isBenCo,
			String email, String password) {
		super();
		EmployeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.reportsTo = reportsTo;
		this.isDH = isDH;
		this.isBenCo = isBenCo;
		this.email = email;
		this.password = password;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getReportsTo() {
		return reportsTo;
	}

	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}

	public boolean isDH() {
		return isDH;
	}

	public void setDH(boolean isDH) {
		this.isDH = isDH;
	}

	public boolean isBenCo() {
		return isBenCo;
	}

	public void setBenCo(boolean isBenCo) {
		this.isBenCo = isBenCo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", reportsTo=" + reportsTo + ", isDH=" + isDH + ", isBenCo=" + isBenCo + ", email=" + email
				+ ", password=" + password + "]";
	}
}
