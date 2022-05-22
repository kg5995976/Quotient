package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://online.actitime.com/it/login.do");
WebElement wb1=dr.findElement(By.id("username"));
         wb1.sendKeys("kpkphad4@gmail.com");
 WebElement wb2=dr.findElement(By.name("pwd"));
       wb2.sendKeys("1234");
       dr.findElement(By.id("loginButton")).click();
      // dr.close();
	}

}
