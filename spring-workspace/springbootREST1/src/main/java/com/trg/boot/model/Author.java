package com.trg.boot.model;

public class Author {
	
	int authId;
	String name;
	String address;
	
	public Author() {
		
	}
	
	public Author(int authId, String name, String address) {
		super();
		this.authId = authId;
		this.name = name;
		this.address = address;
	}

	public int getAuthId() {
		return authId;
	}

	public void setAuthId(int authId) {
		this.authId = authId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [authId=" + authId + ", name=" + name + "]";
	}
	
	
	
	

}
