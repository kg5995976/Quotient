package com.arrayProgram;

public class ArrayprogramString {

	public static void main(String[] args) {
		String[] s=new String[4];
		s[0]="Manual";
		s[1]="java";
		s[2]="SQL";
		s[3]="Autom";
		System.out.println(s);
		for(String s1:s)
		{
			System.out.println(s1);
			System.out.println(s1.length());
		}
	}

}
