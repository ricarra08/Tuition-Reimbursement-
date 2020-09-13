package com.revature.beans;

public class Approval {
	private int applicationid;
	private boolean dsapprovalflag;
	private boolean dhapprovalflag;
	private boolean bencoapprovalflag;
	
	public Approval() {
		super();
	}
	
	public Approval(int applicationid, boolean dsapprovalflag, boolean dhapprovalflag, boolean bencoapprovalflag) {
		super();
		this.applicationid = applicationid;
		this.dsapprovalflag = dsapprovalflag;
		this.dhapprovalflag = dhapprovalflag;
		this.bencoapprovalflag = bencoapprovalflag;
	}
	
	public int getApplicationid() {
		return applicationid;
	}
	
	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}
	
	public boolean isDsapprovalflag() {
		return dsapprovalflag;
	}
	
	public void setDsapprovalflag(boolean dsapprovalflag) {
		this.dsapprovalflag = dsapprovalflag;
	}
	
	public boolean isDhapprovalflag() {
		return dhapprovalflag;
	}
	
	public void setDhapprovalflag(boolean dhapprovalflag) {
		this.dhapprovalflag = dhapprovalflag;
	}
	
	public boolean isBencoapprovalflag() {
		return bencoapprovalflag;
	}
	
	public void setBencoapprovalflag(boolean bencoapprovalflag) {
		this.bencoapprovalflag = bencoapprovalflag;
	}
	
	@Override
	public String toString() {
		return "Approval [applicationid=" + applicationid + ", dsapprovalflag=" + dsapprovalflag + ", dhapprovalflag="
				+ dhapprovalflag + ", bencoapprovalflag=" + bencoapprovalflag + "]";
	}
}
