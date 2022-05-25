package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver dr=new ChromeDriver();
		dr.get("https://online.actitime.com/it/login.do");
		boolean status=dr.findElement(By.xpath("//div[@class='atProductName']")).isDisplayed();
	    System.out.println(status);
	    WebElement wb=dr.findElement(By.id("keepLoggedInCheckBox"));
	   wb.click();
	   Thread.sleep(3000);
	   boolean status1=wb.isSelected();
	   System.out.println(status1);
	   wb.click();
	   boolean status2=wb.isSelected();
	   System.out.println(status2);
	   
	    dr.close();
	
	}

}
