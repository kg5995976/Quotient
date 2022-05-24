package com.Collectionprogram;

import java.util.Arrays;
import java.util.List;

public class Que1Arraylist {
//Array to ArrayList
	public static void main(String[] args) {
		String[] arr= {"c","Java","Testing","SQL","Automation"};
		//conversion of Array to Arraylist
		List<String>lst= Arrays.asList(arr);

		
		System.out.println(lst);
		
	}

}
