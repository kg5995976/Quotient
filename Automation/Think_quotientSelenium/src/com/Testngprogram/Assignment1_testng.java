package com.Testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1_testng {
	WebDriver dr;
	@BeforeMethod 
	public void bfrmthd() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://online.actitime.com/it/login.do");
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("kpkphad4@gmail.com");
		dr.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Tiger@1900");
		dr.findElement(By.xpath("//a[@id='loginButton']")).click();
	}
	@Test(priority=1)
	public void Createcustomer() {
		
		dr.findElement(By.xpath("//div[@id='container_tasks']")).click();
        dr.findElement(By.xpath("//div[@class='title ellipsis']")).click();
        dr.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        dr.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("xawjh");
        dr.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Customer9");
        dr.findElement(By.xpath("//div[@class='emptySelection']")).click();
        dr.findElement(By.xpath("//div[div[div[@class='emptySelection']]]/following-sibling::div/div/div/div/div[text()='Galaxy Corporation']")).click();
        dr.findElement(By.xpath("//div[text()='Create Customer']")).click();
        String ActualResult=dr.findElement(By.xpath("//span[contains(text(),'has been created')]")).getText();
        String ExpectedResult="has been created";
        if(ActualResult.contains(ExpectedResult))
        {
        	System.out.println("Test case is passed==true");
        }else {
        	System.out.println("Test case is failed==false");
        }
        
	}
	@Test(priority=2)
	public void NewProject() {
		
		dr.findElement(By.xpath("//div[@id='container_tasks']")).click();
        dr.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		dr.findElement(By.xpath("//div[@class='item createNewProject']")).click();
		dr.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("ksdhkjl");
		dr.findElement(By.xpath("//div[@class='emptySelection']")).click();
		dr.findElement(By.xpath("//div[div[div[@class='emptySelection']]]/following-sibling::div/div/div/div/div[text()='Big Bang Company']")).click();
		dr.findElement(By.xpath("//div[text()='Create Project']")).click();
	}
	@Test(priority=3)
	public void NewTasks() {
		dr.findElement(By.xpath("//div[@id='container_tasks']")).click();
		dr.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		dr.findElement(By.xpath("//div[@class='item createNewTasks']")).click();
		dr.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
	}
	@Test(priority=4)
	public void Reports() throws InterruptedException {
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
	/*while(true)
	    try {
			dr.findElement(By.xpath("//td[@title='October 7, 2022']")).click();
		}catch (Exception e)
		{
             dr.findElement(By.xpath("//a[@title='Next month (PageDown)']")).click();			
		} */
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
	}
	@Test(priority=5)
	public void Users() throws InterruptedException {
		dr.findElement(By.xpath("//div[@id='container_users']")).click();
		dr.findElement(By.xpath(" //div[text()='New User']")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("Tress");
		dr.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("Jason");
		dr.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("Tress123@gmail.com");
		dr.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		dr.findElement(By.xpath("//div[text()='Close']")).click();
	}
	@AfterMethod
	public void afrmthd() {
		dr.findElement(By.id("logoutLink")).click();
        dr.close();
   		
	}
	

}



