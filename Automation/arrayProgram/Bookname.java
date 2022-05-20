package com.arrayProgram;

public class Bookname {

	public static void main(String[] args) {
	Book[] b=new Book[4];
	b[0]=new Book("Testing");
	b[1]=new Book("java");
	b[2]=new Book(".net");
	b[3]=new Book("Data Science");
	for(Book b1:b) {
		System.out.println(b1.toString());
	
	}
	}
	

}
class Book{
	String title;
	public Book(String title) {
		this.title=title;
	}
	public String toString() {
		return "Title:"+title;
	}
	}
