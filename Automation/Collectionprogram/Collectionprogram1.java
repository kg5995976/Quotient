package com.Collectionprogram;

import java.util.ArrayList;
import java.util.List;

public class Collectionprogram1 {

	public static void main(String[] args) {
 List lst = new ArrayList(); //Upcast(oops concept)(Creating object of subclass-Arraylist and assign it to SUperclass-List reference variable))
 lst.add(7364);
 lst.add("savdfgt");
 lst.add('r');
 lst.add(9845.2563);
 System.out.println(lst);//o/p-all element
 System.out.println(lst.size());
 for(int i=0;i<lst.size();i++)
 {
	 System.out.println(lst.get(i));
 
 }

	}

}
