package com.arrayProgram;

public class Arrayprogram3 {

	public static void main(String[] args) {
		int[] ar={1,4,5,9,12,34,48,30,68,75,81,97};
		//o/p=81
		int bigger=0;
		for(int a:ar)
		{
			if(bigger<a)
			{
				bigger=a;
			}
		}
		System.out.println("Bigger:"+bigger);
	}

}
