package com.oopsprograms;
//Aggregation
public class Testclass {

	public static void main(String[] args) {
		Address ad=new Address("Pune", "Maharashtra", "India");
		Student s=new Student("shyam", 76, "Maths", ad);
		s.display();
	}

}
