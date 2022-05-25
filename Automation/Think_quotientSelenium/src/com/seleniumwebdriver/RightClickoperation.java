package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickoperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		//Implicit wait statement
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        Actions act=new Actions(dr);
		
		act.contextClick(dr.findElement(By.xpath("//span[text()='right click me']"))).build().perform();
	    dr.findElement(By.xpath("//span[text()='Copy']")).click();
	    act.sendKeys(Keys.ENTER).perform();
		
		dr.close();
	}

}
