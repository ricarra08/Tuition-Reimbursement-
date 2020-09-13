package com.revature.beans;

public class GradingFormat {
	private int GradingID;
	private String format;
	private String PassingGradeBL;

	public GradingFormat() {
		super();
		
	}
	public GradingFormat(int GradingID, String format, String PassingGradeBL) {
		this.GradingID = GradingID;
		this.format = format; 
		this.PassingGradeBL = PassingGradeBL;
		
	}

	public int getGradingID() {
		return GradingID;
	}

	public void setGradeFormatId(int GradingID) {
		this.GradingID = GradingID;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getPassingGradeBL() {
		return PassingGradeBL;
	}

	public void setPassingGradeBL(String PassingGradeBL) {
		this.PassingGradeBL = PassingGradeBL;
	}

}
