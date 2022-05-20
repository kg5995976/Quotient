package com.oopsprograms;

//Inheritance in java (parent-child relationship)
// advantages of inheritance is reusuability of methods and fields also
public class SBI extends RBI {
	//method overiding(subclass can change method 8%in superclass and 9%in subclass)
	public void interest_rate() {
		System.out.println("Interest rate 9%");
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.interest_rate();
		s.a=3457;
		System.out.println(s.a);
		
	}

}
