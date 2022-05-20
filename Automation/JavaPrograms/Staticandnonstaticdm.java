package com.JavaPrograms;

public class Staticandnonstaticdm {
	static String name;
	int age;
	//static method 
	public static void details(Staticandnonstaticdm s1) {
		name="AARAV";
		s1.age=15;
		
	}
	//Non static method
	public void details1() {
		name=" Amol";
		age=14;
		
	}

	public static void main(String[] args) {
	Staticandnonstaticdm s=new Staticandnonstaticdm();	
 details(s);
	}

}

