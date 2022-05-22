package com.Stringprograms1.java;

public class ReverseStringBuilder {

	public static void main(String[] args) {
	System.out.println(reversestring("java program"));	
		
	}
   public static String reversestring(String s) {
	   StringBuilder sb=new StringBuilder();//String builder is mutable(does not create multiple object for each char in backhend,it saves memory).
	  //StringBuffer sb1=new StringBuffer();
	   //Threadsafe,Synchronised  (thread is a path of execution)
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   sb.append(s.charAt(i));
	   }
	return sb.toString();
	}

}

