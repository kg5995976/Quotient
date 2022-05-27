package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		//Implicit wait
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
		dr.findElement(By.id("alertBox")).click();
		//move the control to alert popup
		Alert alt=dr.switchTo().alert();
		//get the text on alert
		String alttext=alt.getText();
		System.out.println(alttext);
		alt.accept();
		Thread.sleep(3000);
		//click on cancel button on alert
		dr.findElement(By.id("confirmBox")).click();
		Alert alt1=dr.switchTo().alert();
		alt1.dismiss();
		//to pass text in textBox in alert popup
		dr.findElement(By.xpath("//button[@id='promptBox']")).click();
		Alert alt2=dr.switchTo().alert();
		//Thread.sleep(3000);
		alt2.sendKeys("Selenium");//hardcoding data
		Thread.sleep(3000);
		alt2.accept();
	}

}
