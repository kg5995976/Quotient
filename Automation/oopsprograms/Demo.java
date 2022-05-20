package com.oopsprograms;

abstract public class Demo {
	//abstract method/incomplete method/hidesome and show only require functionality/body is absent

	Demo(){
		System.out.println("Demo constructor");
	}
	abstract public void Test1();//body absent/incomplete method
	abstract public void Test2();
	
	public void Test3() {  //complete method/concrete method
		
	}

}
