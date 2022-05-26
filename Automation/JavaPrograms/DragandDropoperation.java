package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropoperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		//Implicit wait Statement
		//dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		dr.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement wb1=dr.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement wb2=dr.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(dr);
		act.dragAndDrop(wb1,wb2).build().perform();
		//dr.close();

	}

}
