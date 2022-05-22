package com.Stringprograms1.java;

public class Countofcharacter {

	public static void main(String[] args) {
		String s="Java Developer";//length=14
		//o/p=j=1,a=2 how many time that char is present in the string
		//java Develoer=14-13=1,p is 1 time present
		System.out.println(getcount(s,'p'));
		System.out.println(getcount(s,'J'));
		System.out.println(getcount(s,'e'));
		System.out.println(getcount(s,'D'));
		
		

	} 
	public static int getcount(String s,char c) {
	return s.length()-s.replace(c+"","").length();

}
}