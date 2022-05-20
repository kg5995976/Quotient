package com.JavaPrograms;
//Nonstatic block=Any block which is not declared with Static keyword
//Nonstatic block is also used for initilisating Non static variable
public class Nonstaticblock {
	
	int a;
	
	public Nonstaticblock() {
	System.out.println("Constructor execute");

}
	//Nonstatic Block
	
	
	{
		a=457;
		System.out.println("Nonstatic block in java");
	}

	public static void main(String[] args) {
		System.out.println("Main starts");
		Nonstaticblock n=new Nonstaticblock();
		//Non Static block
		//Nonstatic initialisation
		//reference return
		//constructor execute
		Nonstaticblock n1=new Nonstaticblock();
		System.out.println(n1.a);
		System.out.println("Main ends");
		
		
	}

}
