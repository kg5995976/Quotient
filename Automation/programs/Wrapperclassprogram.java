package com.programs;

public class Wrapperclassprogram {
//Boxing and unboxing(Primitive type)
	public static void main(String[] args) {
		int a=453;
		boolean b=true;
		double d=3654.455;
		String s="124578";
		
		//Wrapper class
		//Boxing
		Integer i=a;//object is created 
		Boolean b1=b; //Boxing-Storing primitive type value inside object
	    // Double d1=new Double(d);
	     Double d1=d;
	     
	     //unboxing-fetching the data
	     System.out.println(i);
	     System.out.println(d1.doubleValue());
	     System.out.println(b1.booleanValue());
	     
	     //parsing method-converting non-primitive to primitive(Casting)
	     System.out.println(i.intValue());
	     int a1=Integer.parseInt(s);
	     double d2=Double.parseDouble(s);
	     System.out.println(a1);
	     System.out.println(d2);
	}

}
