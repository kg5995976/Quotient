package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to("https://www.facebook.com/");
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anita");
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Prasad");
		dr.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("12345788");
		dr.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("abcd1234");
		Select sel=new Select(dr.findElement(By.id("day")));
		sel.selectByIndex(10);
		Select sel1=new Select(dr.findElement(By.id("month")));
		sel1.selectByValue("5");
		Select sel2=new Select(dr.findElement(By.id("year")));
		sel2.selectByVisibleText("1997");
		System.out.println(sel.isMultiple());

	}

}
