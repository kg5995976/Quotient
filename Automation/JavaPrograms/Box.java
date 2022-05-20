package com.JavaPrograms;

public class Box {
	int length;
	int breadth;
	int height;
	
	Box(){
		
	}
	
	Box(int l,int b,int h){
		length=l;
		breadth=b;
		height=h;
	}
	Box(int l){
	length=breadth=height=l;
	}
	void display() {
		System.out.println("Length="+length+",Breadth="+breadth+",Height="+height);
	}
}

	