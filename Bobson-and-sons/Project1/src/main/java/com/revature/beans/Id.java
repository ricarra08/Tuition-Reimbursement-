package com.revature.beans;

public class Id {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Id [id=" + id + "]";
	}

	public Id(String id) {
		super();
		this.id = id;
	}

	public Id() {
		super();
		
	}
	
}
