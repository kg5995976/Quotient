package com.Stringprograms1.java;

public class Stringprogram1 {
	String name;
	public Stringprogram1(String name) {
		this.name=name;
	}
	//override the object class method
	public String tostring() {
		return "[Name="+name+"]";
	}

	public static void main(String[] args) {
	Stringprogram1 s=new Stringprogram1("Demo");
	System.out.println(s.tostring());//o/p (due to object class ) is Address of this class 
	

	}

}
