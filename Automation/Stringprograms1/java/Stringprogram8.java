package com.Stringprograms1.java;

public class Stringprogram8 {

	public static void main(String[] args) {
		String s="1234566JaVa1245program";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')  //lower case
			{
				s1+=c;
			}
			else if(c>='A'&&c<='Z') //Upper case
			{
			     s1+=c;	
			}
		}
		System.out.println(s1);

	}

}
