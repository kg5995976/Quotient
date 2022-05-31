package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElement4 {
@Test
public void displaylogo() {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver dr=new ChromeDriver();
		dr.get("https://online.actitime.com/it/login.do");
		boolean status=dr.findElement(By.xpath("//div[@class='atProductName']")).isDisplayed();
	    System.out.println(status);
	    //Hard Assert-(If expected and Acual does not match it will terminate the execution)
	 //   Assert.assertTrue(status,"Logo is not displaying");
        Assert.assertFalse(status,"Logo is not displaying");	
       

}

}
