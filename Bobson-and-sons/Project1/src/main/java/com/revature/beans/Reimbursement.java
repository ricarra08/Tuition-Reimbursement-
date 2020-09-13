package com.revature.beans;

public class Reimbursement {
	
	private int applicationid;
	private String submittedon; //BE WARY OF DATE FORMAT, THIS MAY NEED REWORK
	private int employeeid;
	private int educationtypeid;
	private boolean urgent;
	
	public Reimbursement() {
		super();
	}
	public Reimbursement(int applicationid, String submittedon, int employeeid, int educationtypeid, boolean urgent) {
		super();
		this.applicationid = applicationid;
		this.submittedon = submittedon;
		this.employeeid = employeeid;
		this.educationtypeid = educationtypeid;
		this.urgent = urgent;
	}
	public int getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}
	public String getSubmittedon() {
		return submittedon;
	}
	public void setSubmittedon(String submittedon) {
		this.submittedon = submittedon;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getEducationtypeid() {
		return educationtypeid;
	}
	public void setEducationtypeid(int educationtypeid) {
		this.educationtypeid = educationtypeid;
	}
	public boolean isUrgent() {
		return urgent;
	}
	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}
	@Override
	public String toString() {
		return "Reimbursement [applicationid=" + applicationid + ", submittedon=" + submittedon + ", employeeid="
				+ employeeid + ", educationtypeid=" + educationtypeid + ", urgent=" + urgent + "]";
	}
}
