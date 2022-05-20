package com.JavaPrograms;

public class Demo {
	public static void m1() {
		m2();
		System.out.println("M1 starts");
	}
	public static void m2() {
		System.out.println("M2 starts");
		
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		m1();
		System.out.println("Main ends");

	}

}
