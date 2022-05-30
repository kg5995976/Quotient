package com.Testngprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actitimeapp {
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
	@Test
	public void Createcustomer() {
		
		dr.findElement(By.xpath("//div[@id='container_tasks']")).click();
        dr.findElement(By.xpath("//div[@class='title ellipsis']")).click();
        dr.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
        dr.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("sdnhgghhj");
        dr.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("New customer7");
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
	@Test
	public void NewProject() {
		
		dr.findElement(By.xpath("//div[@id='container_tasks']")).click();
        dr.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		dr.findElement(By.xpath("//div[@class='item createNewProject']")).click();
		dr.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")).sendKeys("ahgskjsa");
		dr.findElement(By.xpath("//div[@class='emptySelection']")).click();
		dr.findElement(By.xpath("//div[div[div[@class='emptySelection']]]/following-sibling::div/div/div/div/div[text()='Big Bang Company']")).click();
		dr.findElement(By.xpath("//div[text()='Create Project']")).click();
	}
	@AfterMethod
	public void afrmthd() {
		dr.findElement(By.id("logoutLink")).click();
        dr.close();
   		
	}
	

}
