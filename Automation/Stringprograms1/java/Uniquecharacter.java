package com.Stringprograms1.java;

public class Uniquecharacter {

	public static void main(String[] args) {
		String s="Java Developer";
		//o/p=jav Devlopr
		String s1="";//whenever char in string is not present then it will return -1.
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1)//if char is not present in s1 then (bcz string return type is -1)so it will return -1 and it with c  
			{
				s1=s1+c;//char not present then add c value in s1
			}
		}
		System.out.println(s1);
		
	}

}
