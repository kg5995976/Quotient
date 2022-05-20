package com.Stringprograms1.java;

public class Stringprogram4 {

	public static void main(String[] args) {
		String s=new String("Manual Tester");//String address is present in Heap memory area
		String s1="Manual Tester"; //String literal address is present in string pool memory area
        System.out.println(s==s1);//o/p false
        String s2="Manual Tester";//String literal (String pool location)
        System.out.println(s1==s2);//o/p true
        System.out.println(s.equals(s1));//comapare address of object
	}

}
