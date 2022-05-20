package com.JavaPrograms;

public class Nonstaticvar {
	
	int a;
	int b;

	public static void main(String[] args) {
		System.out.println("Main starts'");
		//create object of this class
		//here n is referance variable of an object
		Nonstaticvar n=new Nonstaticvar();
		System.out.println("a="+n.a);
		Nonstaticvar n1=new Nonstaticvar();
		n1.a=100;
		n1.b=200;
		System.out.println("a="+n1.a+",b="+n1.b);
		}

}
