package com.oopsprograms;

//Multilevel Inheritance

class A{
	void Test() {
		System.out.println("Test A");
	}
}
class B extends A{
	void Test1() {
		System.out.println("Test B");
	}
}
class c extends B{
	void Test1() {
		System.out.println("Test c");
	}
}

public class Test1 {

	public static void main(String[] args) {
		B b=new B();
		b.Test();
		b.Test1();
		c c=new c();
		c.Test1();
	}

}
