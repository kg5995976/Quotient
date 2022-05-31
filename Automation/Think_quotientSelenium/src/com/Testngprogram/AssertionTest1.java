package com.Testngprogram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest1 {
@Test
public void Test1(){
	System.out.println("Test starts");
	Assert.assertEquals("Java Developer","Java Developer","Values are not matching");
    System.out.println("Test Ends");

}
@Test
public void Test2() {
	System.out.println("Test2 starts");
	Assert.assertEquals("Java","Java");
	Assert.assertEquals(true,"");
	System.out.println("Test2 ends");
}
}
 