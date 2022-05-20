package com.JavaPrograms;

public class Student1 {
	
		String name;
		int age; 
		char c;
		String sub;
		int Rollnum;
		
		//this keyword always refers Non static variable of current class/object.
		//it will differentiate between local and non static variable
		public Student1(String name,int age,char c,String sub,int Rollnum) {
			this.name=name;
			this.age=age;
			this.c=c;
			this.sub=sub;
			this.Rollnum=Rollnum;
		}
		public void display() {
			System.out.println("[Name="+name+",Age="+age+",Gender="+c+",Subject="+sub+",Rollnum="+Rollnum+"]");
		}
				

		public static void main(String[] args) {
		Student1 s=new Student1("AARAV", 14, 'M', "ENGLISH", 1);
		s.display();
		}

	}

