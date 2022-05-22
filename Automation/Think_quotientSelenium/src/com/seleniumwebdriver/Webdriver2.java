package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
         dr.navigate().to("https://www.flipkart.com");
         Thread.sleep(3000);
         String titlepage=dr.getTitle();
         dr.findElement(By.xpath("//button[@class='_2Sn47c']")).click();
         Thread.sleep(3000);
         dr.findElement(By.xpath("//div[text()='Grocery']")).click();
         Thread.sleep(3000);
         dr.navigate().back();
         Thread.sleep(3000);
         dr.navigate().forward();
         Thread.sleep(3000);
         dr.navigate().refresh();
         
        
	}

}
