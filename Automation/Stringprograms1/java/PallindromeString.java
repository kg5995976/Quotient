package com.Stringprograms1.java;

public class PallindromeString {

	public static void main(String[] args) {
		String s="Madam";
		System.out.println(ispallindrome(s));
		System.out.println(ispallindrome("Java"));
	}

	public  static boolean ispallindrome(String s) {
		s=s.toLowerCase();//madam
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				return false;
			}
	}
		return true;
	}

}
