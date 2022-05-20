package com.oopsprograms;

public class Keyword1 extends Keyword  {
	int bonus=34543;
	int salary;
	void total_sal() {
		int totalsal=super.salary+bonus;
		//Super keyword is used to call superclass datamember
		System.out.println(totalsal);
		super.employee_sal();
	}
	public static void main(String[] args) {
		Keyword1 k=new Keyword1();
		k.total_sal();
		
	}

}
