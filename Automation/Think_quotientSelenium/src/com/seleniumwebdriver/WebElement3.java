package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://online.actitime.com/it/login.do");
WebElement wb=dr.findElement(By.id("username"));
         wb.sendKeys("Seed4@gmail.com");
         String val=wb.getAttribute("value");
         System.out.println(val);
	}

}
