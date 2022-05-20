package com.JavaPrograms;


public class Student {
	String name;
	int age; 
	char c;
	String sub;
	int Rollnum;
	
	//main use of constructor is to initialise Non Static variables
	public Student(String s,int a,char c1,String su,int r) {
		name=s;
		age=a;
		c=c1;
		sub=su;
		Rollnum=r;
	}
	public void display() {
		System.out.println("[Name="+name+",Age="+age+",Gender="+c+",Subject="+sub+",Rollnum="+Rollnum+"]");
	}
			

	public static void main(String[] args) {
	Student s=new Student("AARAV", 14, 'M', "ENGLISH", 1);
	s.display();
	}

}
