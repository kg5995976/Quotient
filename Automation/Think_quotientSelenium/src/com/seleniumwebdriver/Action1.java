package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException   {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.manage().window().maximize();
			//Implicit wait statement
			dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			dr.navigate().to("https://www.flipkart.com");
			dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Actions act=new Actions(dr);
			act.moveToElement(dr.findElement(By.xpath("//div[text()='Electronics']"))).build().perform();
			Thread.sleep(3000);
			dr.findElement(By.xpath("//*[text()='Gaming']")).click();
			Thread.sleep(3000);
			dr.findElement(By.linkText("Games")).click();
			dr.close();
			

	}

}
