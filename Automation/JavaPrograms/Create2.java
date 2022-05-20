package com.JavaPrograms;
// parametarised constructor

public class Create2 {
	
	public Create2(int a) {
		System.out.println("Parametarised Constructor a="+a);
	}
	
	int a;
	public void m1() {
		
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		Create2 c=new Create2(10);
		c.m1();
		System.out.println("Main ends");
	}

}
