package com.JavaPrograms;

public class Constructoroverloading {
	
	Constructoroverloading(){
		System.out.println("Constructor with no argument"); 
	}
	Constructoroverloading(int a){
		System.out.println("Constructor with int argument a="+a);
	}
	Constructoroverloading(double d,int a){
		System.out.println("constructor with double and int argument d="+d+",a="+a);
	}
	
	
	
	
	

	public static void main(String[] args) {
		Constructoroverloading c=new Constructoroverloading();
		Constructoroverloading c1=new Constructoroverloading(100);
		Constructoroverloading c2=new Constructoroverloading(43.257,55);
		System.out.println("Main ends");
	}

}
