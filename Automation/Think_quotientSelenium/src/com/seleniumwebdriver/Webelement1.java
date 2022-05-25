package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://online.actitime.com/it/login.do");
WebElement wb=dr.findElement(By.id("username"));
         wb.sendKeys("Seed4@gmail.com");
        Thread.sleep(4000);//Normal Wait/Hardcoded wait statement
        wb.clear();
        String text=dr.findElement(By.id("keepLoggedInLabel")).getText();
	    System.out.println(text);
	    String forgot=dr.findElement(By.id("toPasswordRecoveryPageLink")).getText();
	    System.out.println(forgot);
	    dr.close();
	}

}
