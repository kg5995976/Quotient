package com.Stringprograms1.java;

public class Stringprogram6 {
//Reverse String
	public static void main(String[] args) {
		String s="Manual Tester";
		//o/p=retseT launaM
		String s1="";
		int n=s.length()-1;
		for(int i=n;i>=0;i--)
		{
			char c=s.charAt(i);
			s1+=c;
		}
		System.out.println(s1);
	}

}
