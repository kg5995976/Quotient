package com.oopsprograms;

public class Chain2 extends Chain1 {
	
	public Chain2() {
		super(45);
		System.out.println("chain2 constructor");
	}
    
public static void main(String[] args) {
	//Constructor Chaining(calling immediate superclass constructor from subclass constructor when sub class object is created)
	
	Chain2 c=new Chain2();
	
}
}
