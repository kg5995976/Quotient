package com.JavaPrograms;

public class Localvariable {
	public static String Function1(String name)
	{
		String Fullname=name+" Singh";
		return Fullname;
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		String name=Function1("Shyam");
		System.out.println("Name:-"+name);
		
	}

}
