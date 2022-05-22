package com.arrayProgram;

public class Arrayprogram1 {

	public static void main(String[] args) {
		//int a=27262
		//Syntax to create Array
		int[] ar=new int[4];
		ar[0]=43;
		ar[1]=33;
		ar[2]=47;
		ar[3]=84;
		System.out.println(ar);//o/p=memory address of the array
	  /*  for(int i=0;i<ar.length;i++)
	    {
	    	System.out.println(ar[i]);//o/p=index value of Array 43,33,47,84
	    }*/
	 //for each loop
		for(int a:ar)
		{
			System.out.println(a);
		}
	
	}

}
