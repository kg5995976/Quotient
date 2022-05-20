package com.oopsprograms;

public class Compilerimepolymorphism {
	//Static polymorphism/compiletime
	//method overloading
static void m1() {
	System.out.println("m1 with no parameter");
}
static void m1(int a){
	System.out.println("m1 with int parameter");
	
}
static void m1(double d,String s) {
	System.out.println("m1 with double and string parameter");
	
}
	public static void main(String[] args) {
		m1();
		m1(213);
		m1(201.12,"Test");
		
	}

}
