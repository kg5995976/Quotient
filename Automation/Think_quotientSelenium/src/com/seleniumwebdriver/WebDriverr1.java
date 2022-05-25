package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverr1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         dr.navigate().to("https://www.flipkart.com");
         
         dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
         Thread.sleep(3000);
         dr.findElement(By.xpath("//div[text()='Grocery']")).click();
	     dr.close();
	
	}
	

}
