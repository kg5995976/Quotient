package com.Stringprograms1.java;

public class Countofeachcharacter {

	public static void main(String[] args) {
		String s = "Java Developer";
		String s1 = "";

		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1)
			{
			int n=Countofcharacter.getcount(s1, c);//getcount method of previous program
			System.out.println(c+"="+n);
			s1=s1+c;
			}
			
		}
	}

}
