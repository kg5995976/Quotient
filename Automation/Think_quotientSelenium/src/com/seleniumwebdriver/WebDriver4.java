package com.seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver4 {

	private static final char[] Pagesource = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver dr=new ChromeDriver();
	     dr.manage().window().maximize();
	     dr.navigate().to("https://www.flipkart.com");
	     String pagesource=dr.getPageSource();//Capturing all html sourcecode of this current url
	     System.out.println(pagesource);
	     dr.close();
	   //dr.quit();
	
	
	
	
	}

}
