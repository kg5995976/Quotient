package com.Stringprograms1.java;

public class Stringprogram7 {

	public static void main(String[] args) {
		String s="java12345programs98765";
		//o/p=1234598765
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				s1+=c;
			}
		}
		System.out.println(s1);
	}

}
