package com.mapprogram;

import java.util.Hashtable;

public class Hashtableprogram {

	public static void main(String[] args) {
     Hashtable<Integer,String> map=new Hashtable<Integer,String>();
      map.put(23,"Test1");
     // map.put(null, null);
      //map.put(23, null);
        map.put(1, "Test2");
        map.put(45, "Java");
        map.put(2,"Test4");
      //o/p-last to first order
      System.out.println(map);//o/p-exception,hashtable doesnt allow null key/value


	}

}
