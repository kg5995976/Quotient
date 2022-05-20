package com.oopsprograms;

public class FinalKeyword {
	//if a class is declared as final we cant inherited it
	//final keyword with variable
	
	public final int a=14578;//initialisation of final variable
   
	//final method can be inherited
	//we cannot override the final method
	
	final public void Test1() {
    	 System.out.println("Test method");
     }
	public static void main(String[] args) {
		FinalKeyword f=new FinalKeyword();
		//final keyword value is always constant
           System.out.println(f.a);
	}

}
