package com.oopsprograms;

public class Demo1 extends Demo {

	@Override
	public void Test1() {
		System.out.println("Test1 in Demo1");
		
	}

	@Override
	public void Test2() {
		System.out.println("Test2 in Demo1");
		
	}
	public static void main(String[] args) {
		Demo d=new Demo1();
		d.Test2(); 
		
		
	}

}
