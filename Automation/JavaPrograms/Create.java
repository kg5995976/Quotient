package com.JavaPrograms;

public class Create {
	//if we have to call any method(return type void) using object we go and call the method
	//data member(variables declares in class)
	// 3 data member are there in this class=Variables,method,constructor
	
	//Syntax of default constructor(constructor name=class name)
	public Create() {
	System.out.println("Constructor in java");	
	
	}
	 int a;
	 public void m1() {
		 
		 
	 }

	public static void main(String[] args) {
	 	System.out.println("Main starts");
		Create c=new Create();  //JVM calls and execute the constructor
		Create c1=new Create(); 
		System.out.println("Main ends");

	}

}
