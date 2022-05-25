package com.seleniumwebdriver;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//Implicit wait
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("https://www.flipkart.com");
		//Thread.sleep(3000);
		String titlepage1=dr.getTitle();
		System.out.println(titlepage1);
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//Thread.sleep(3000);
		
		//Thread.sleep(3000);//Normal/hardcoded wait statement
		//WebDriverWait wait=new WebDriverWait(dr,20);//explicit Wait
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Grocery']")));
		//dr.findElement(By.xpath("//div[text()='Grocery']")).click();
		FluentWait fw=new FluentWait(dr);
		fw.withTimeout(20, TimeUnit.SECONDS);
		fw.pollingEvery(500,TimeUnit.SECONDS);
		fw.ignoring(Exception.class);
		String titlepage2=dr.getTitle();
		String url1=dr.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(url1);
		
		System.out.println(titlepage2);
		dr.navigate().back();
		Thread.sleep(3000);
		String titlepage3=dr.getTitle();
		String url2=dr.getCurrentUrl();
		Thread.sleep(3000);
		System.out.println(url2);
		System.out.println(titlepage3);
		dr.navigate().forward();
		String titlepage4=dr.getTitle();
		
		Thread.sleep(3000);
		System.out.println(titlepage4);
		Thread.sleep(3000);
		dr.navigate().refresh();
		dr.close();
	}

}
