package com.JavaPrograms;

public class Demo1 {
	//Blocks in java(group of statement inside curly braces is called Blocks)
		//
	static int a;
	//Static block (Static Block execute before Main method)
	//we can create multiple static block in one java class
	//we can initialise variable also ,thats why its called SIB(Static initialising block)
	static
	{
		a=555;
		System.out.println("Static Block in java class");
		System.out.println(a);
	}
	static
	{
		System.out.println("Static Block1 in java class");
	}
	static
	{
		System.out.println("Static Block2 in java class");
	}
	static
	{
		System.out.println("Static Block3 in java class");
	}

	public static void main(String[] args) {
		
          System.out.println("Main starts");
          System.out.println("Main ends");
	}

}
