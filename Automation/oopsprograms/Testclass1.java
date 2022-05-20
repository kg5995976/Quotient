package com.oopsprograms;
//for polymorphism =inheritance,upcasting,overriding this for necessary things


//Run time polymorphism
public class Testclass1 {
//instance means object
	public static void main(String[] args) {
	//polymorphism=1 type of object showing diff.behaviour
	//method overriding	
		Animal a1,a2,a3;
	a1=new Animal();
	a1.make_sound();
	 a2=new Dog();//upcasting
	a2.make_sound();//dog class method
	a3=new Cat();
	a3.make_sound();//Cat class method

	}

}
