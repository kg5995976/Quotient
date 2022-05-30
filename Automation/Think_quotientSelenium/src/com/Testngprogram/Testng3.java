package com.Testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng3 {
	@Test
	public void NewTask() throws InterruptedException {  //passed
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://online.actitime.com/it/login.do");
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("kpkphad4@gmail.com");
		dr.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Tiger@1900");
		dr.findElement(By.xpath("//a[@id='loginButton']")).click();
		dr.findElement(By.xpath("//div[@id='container_tasks']")).click();
		dr.findElement(By.xpath("//div[@class='title ellipsis']")).click();
	/*	dr.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		dr.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();//remain
		
		
		
		
		//Report-passed
		dr.findElement(By.xpath("//div[@id='container_reports']")).click();
		dr.findElement(By.xpath("//div[text()='New Report']")).click();
		dr.findElement(By.xpath("//span[text()='High Priority Tasks']")).click();
		dr.findElement(By.xpath("//span[@class='components-DateRangeSelector-text--177CiYA0']")).click();
		dr.findElement(By.xpath("//span/span[text()='Current month']")).click();
		dr.findElement(By.xpath("//div[text()='May 01, 2022']")).click();
		//dr.findElement(By.xpath("//a[@class='rc-calendar-month-select']")).click();
		//dr.findElement(By.xpath("////span[@class='rc-calendar-month-panel-year-select-content']")).click();
		dr.findElement(By.xpath("//td[@title='May 20, 2022']")).click();
		dr.findElement(By.xpath("//div[text()='May 31, 2022']")).click();
		Thread.sleep(3000);
	while(true)
	    try {
			dr.findElement(By.xpath("//td[@title='October 7, 2022']")).click();
		}catch (Exception e)
		{
             dr.findElement(By.xpath("//a[@title='Next month (PageDown)']")).click();			
		} 
		dr.findElement(By.xpath("//a[@title='Next month (PageDown)']")).click();
		dr.findElement(By.xpath("//a[@title='Next month (PageDown)']")).click();
		dr.findElement(By.xpath("//a[@title='Next month (PageDown)']")).click();
		dr.findElement(By.xpath("//a[@title='Next month (PageDown)']")).click();
		dr.findElement(By.xpath("//a[@title='Next month (PageDown)']")).click();
		dr.findElement(By.xpath("//td[@title='October 7, 2022']")).click();
		Thread.sleep(3000);
		//dr.findElement(By.xpath("//div[@class='components-Dropdown-trigger--1w6PGjU6 containers-CustomFieldsReport-selector--1g2kOfAr containers-CustomFieldsReport-toolbarItem--3LoAo4Ee components-GroupedMultiSelector-warning--2rO48Uq8']")).click();
		 
		dr.findElement(By.xpath("//span[text()='All customers & projects']")).click();
		dr.findElement(By.xpath("//span[text()='All active customers & projects']")).click();
		dr.findElement(By.xpath("//div[text()='Apply']")).click();
		dr.findElement(By.xpath("//div[div[div[button[div[@class='components-GroupedMultiSelector-text--3TjVcfi1']]]]]")).click();
		dr.findElement(By.xpath("//span[text()='Selected']")).click();
		dr.findElement(By.xpath("//div[text()='Apply']")).click();
		dr.findElement(By.xpath("//div[@class='components-DataFilters-text--3Sy10dhA']")).click();
		dr.findElement(By.xpath("//div[div[label[@class='components-RadioButton-radio--Dqjiy73l']]]")).click();
		dr.findElement(By.xpath("//span[text()='Medium']")).click();
		dr.findElement(By.xpath("//button[@class='components-Buttons-button--2ZtATn8v components-Buttons-default--2AuE4tKC components-Buttons-container--3-Mphkma']")).click();
		dr.findElement(By.xpath("//button[@class='components-ShortcutControl-button--15P8mAYA']")).click();
		dr.findElement(By.xpath("//button[@class='components-Buttons-button--2ZtATn8v components-Buttons-default--2AuE4tKC components-ShortcutControl-saveButton--2ueR6PC6 components-Buttons-container--3-Mphkma']")).click();
		*/
		//@Test
		//public void Users() {
			dr.findElement(By.xpath("//div[@id='container_users']")).click();
			dr.findElement(By.xpath(" //div[text()='New User']")).click();
			Thread.sleep(3000);
			dr.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Tress");
			dr.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Jason");
			dr.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("Tress123@gmail.com");
			dr.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
			dr.findElement(By.xpath("//div[text()='Close']")).click();
		}
	}	


		
		
		
		
		
		
		
		
		
		
	


