package com.revature.beans;

public class Form {
	
	private int formID;
	private int formApplicationID;
	private String formFirstName;
	private String formLastName;
	private String formEventName;
	private String formEventType;
	private int formEventCost;
	private String formEventStartDate;
	private String formEventStartTime;
	private String formEventEndTime;
	private String formEventAddress;
	private String formEventCity;
	private String formEventState;
	private int formEventZip;
	private String formGradedFormat;
	private String formGradeCO;
	private String formDescription;
	
	public Form() {
		super();
	}

	public Form(int formID, int formApplicationID, String formFirstName, String formLastName, String formEventName,
			String formEventType, int formEventCost, String formEventStartDate, String formEventStartTime,
			String formEventEndTime, String formEventAddress, String formEventCity, String formEventState,
			int formEventZip, String formGradedFormat, String formGradeCO, String formDescription) {
		super();
		this.formID = formID;
		this.formApplicationID = formApplicationID;
		this.formFirstName = formFirstName;
		this.formLastName = formLastName;
		this.formEventName = formEventName;
		this.formEventType = formEventType;
		this.formEventCost = formEventCost;
		this.formEventStartDate = formEventStartDate;
		this.formEventStartTime = formEventStartTime;
		this.formEventEndTime = formEventEndTime;
		this.formEventAddress = formEventAddress;
		this.formEventCity = formEventCity;
		this.formEventState = formEventState;
		this.formEventZip = formEventZip;
		this.formGradedFormat = formGradedFormat;
		this.formGradeCO = formGradeCO;
		this.formDescription = formDescription;
	}

	public int getFormID() {
		return formID;
	}

	public void setFormID(int formID) {
		this.formID = formID;
	}

	public int getFormApplicationID() {
		return formApplicationID;
	}

	public void setFormApplicationID(int formApplicationID) {
		this.formApplicationID = formApplicationID;
	}

	public String getFormFirstName() {
		return formFirstName;
	}

	public void setFormFirstName(String formFirstName) {
		this.formFirstName = formFirstName;
	}

	public String getFormLastName() {
		return formLastName;
	}

	public void setFormLastName(String formLastName) {
		this.formLastName = formLastName;
	}

	public String getFormEventName() {
		return formEventName;
	}

	public void setFormEventName(String formEventName) {
		this.formEventName = formEventName;
	}

	public String getFormEventType() {
		return formEventType;
	}

	public void setFormEventType(String formEventType) {
		this.formEventType = formEventType;
	}

	public int getFormEventCost() {
		return formEventCost;
	}

	public void setFormEventCost(int formEventCost) {
		this.formEventCost = formEventCost;
	}

	public String getFormEventStartDate() {
		return formEventStartDate;
	}

	public void setFormEventStartDate(String formEventStartDate) {
		this.formEventStartDate = formEventStartDate;
	}

	public String getFormEventStartTime() {
		return formEventStartTime;
	}

	public void setFormEventStartTime(String formEventStartTime) {
		this.formEventStartTime = formEventStartTime;
	}

	public String getFormEventEndTime() {
		return formEventEndTime;
	}

	public void setFormEventEndTime(String formEventEndTime) {
		this.formEventEndTime = formEventEndTime;
	}

	public String getFormEventAddress() {
		return formEventAddress;
	}

	public void setFormEventAddress(String formEventAddress) {
		this.formEventAddress = formEventAddress;
	}

	public String getFormEventCity() {
		return formEventCity;
	}

	public void setFormEventCity(String formEventCity) {
		this.formEventCity = formEventCity;
	}

	public String getFormEventState() {
		return formEventState;
	}

	public void setFormEventState(String formEventState) {
		this.formEventState = formEventState;
	}

	public int getFormEventZip() {
		return formEventZip;
	}

	public void setFormEventZip(int formEventZip) {
		this.formEventZip = formEventZip;
	}

	public String getFormGradedFormat() {
		return formGradedFormat;
	}

	public void setFormGradedFormat(String formGradedFormat) {
		this.formGradedFormat = formGradedFormat;
	}

	public String getFormDescription() {
		return formDescription;
	}

	public void setFormDescription(String formDescription) {
		this.formDescription = formDescription;
	}

	

	@Override
	public String toString() {
		return "Form [formID=" + formID + ", formApplicationID=" + formApplicationID + ", formFirstName="
				+ formFirstName + ", formLastName=" + formLastName + ", formEventName=" + formEventName
				+ ", formEventType=" + formEventType + ", formEventCost=" + formEventCost + ", formEventStartDate="
				+ formEventStartDate + ", formEventStartTime=" + formEventStartTime + ", formEventEndTime="
				+ formEventEndTime + ", formEventAddress=" + formEventAddress + ", formEventCity=" + formEventCity
				+ ", formEventState=" + formEventState + ", formEventZip=" + formEventZip + ", formGradedFormat="
				+ formGradedFormat + ", formGradeCO=" + formGradeCO + ", formDescription=" + formDescription + "]";
	}

	public String getFormGradeCO() {
		return formGradeCO;
	}

	public void setFormGradeCO(String formGradeCO) {
		this.formGradeCO = formGradeCO;
	}
	
	
}	