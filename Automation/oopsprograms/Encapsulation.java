package com.oopsprograms;

public class Encapsulation {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setSalary(450000);
		System.out.println(e.getSalary());
	}
}
