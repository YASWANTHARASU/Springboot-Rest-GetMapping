package com.yaswanth.restexp;

public class Name {
    public String fname;
    public String lname;
    
    public Name(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
    
    
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
    
}
