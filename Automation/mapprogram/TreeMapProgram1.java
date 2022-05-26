package com.mapprogram;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapProgram1 {

	public static void main(String[] args) {
		SortedMap<Integer,String>sm=new TreeMap<Integer,String>();
        sm.put(1,"Java");
        sm.put(10, "Testing");
        sm.put(3,"Automation");
        sm.put(6,"Manual");
        System.out.println(sm);//o/p-Ascending order
        Set<Entry<Integer,String>> set=sm.entrySet();
        Iterator<Entry<Integer,String>> itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	Map.Entry<Integer,String> map=(Map.Entry<Integer,String>)itr.next();
	    	System.out.println("Keys:-"+map.getKey()+"---"+"Value:-"+map.getValue());
	    }
	
	
	
	}

}
