package com.Collectionprogram;

import java.util.ArrayList;
import java.util.List;

public class Collectionprogram2 {

	public static void main(String[] args) {
		List<Integer>lst=new ArrayList<Integer>();//upcasting
		lst.add(78954);
		lst.add(257);
		lst.add(12345);
		for(Integer integer:lst)
		{
			System.out.println(integer);
		}
		
	}

}
