package com.mapprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		//Map m=new LinkedHashMap();//LinkedHashMap gives data in insertion order
		Map m=new HashMap();//gives data in ascending order
             //Keys,value		
        m.put(3,"dhhdfh");
        m.put("ryukd","yusjk");
        m.put(1,"Test1");
        m.put(5,"java");
        m.put(null,"java2");//null value in keys table -we can store only one time
	    
        System.out.println(m);//o/p-Ascending
        //System.out.println(m.keySet());
        //System.out.println(m.values());
        
        Set set=m.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
          Map.Entry map=(Map.Entry)itr.next();
          System.out.println("Keys:-"+map.getKey()+"----"+"Value:-"+map.getValue());
	
        }
	
	}

}
