package com.JavaPrograms;

public class Calltothisconstructor {
	Calltothisconstructor(){
		this(44.32,65);
		System.out.println("Constructor with no argument"); 
	}
	Calltothisconstructor(int a){
		this();  //call to this execute immediate constructor based on argument
		System.out.println("Constructor with int argument a="+a);
	}
	Calltothisconstructor(double d,int a){
		System.out.println("constructor with double and int argument d="+d+",a="+a);
	}
	
	
	
	
	

	public static void main(String[] args) {
		Calltothisconstructor c=new Calltothisconstructor(99);
		
		System.out.println("Main ends");
	}

}


	