package com.oopsprograms;

public class Address {
	String city;
	String state;
	String country;
	public Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
		
	}
public void display() {
	System.out.println("[City="+city+",State="+state+",Country="+country+"]");
	
}
}
