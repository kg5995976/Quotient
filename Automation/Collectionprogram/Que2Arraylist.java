package com.Collectionprogram;

import java.util.ArrayList;
import java.util.List;

//Arraylist to Array
public class Que2Arraylist {

	public static void main(String[] args) {
		List<Integer>lst=new ArrayList<Integer>();
		lst.add(1245);
		lst.add(2347);
		lst.add(3365);
		lst.add(4210);
		lst.add(7458);
		for(Integer integer:lst)
		{
			System.out.println(integer);
		}
	}

}
