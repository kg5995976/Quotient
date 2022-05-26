package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardoperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver dr=new ChromeDriver();
        dr.manage().window().maximize();
        dr.navigate().to("https://online.actitime.com/it/login.do");
       WebElement wb= dr.findElement(By.id("username"));
       wb.sendKeys("kpkphad4@gmail.com");
       wb.sendKeys(Keys.CONTROL,"a");
       Thread.sleep(3000);
       wb.sendKeys(Keys.CONTROL,"c");
       Thread.sleep(3000);
       wb.sendKeys(Keys.TAB);
       Thread.sleep(3000);
       wb.sendKeys(Keys.CONTROL,"v");
        //dr.findElement(By.name("pwd")).sendKeys("1234",Keys.ENTER);
        
	}

}
