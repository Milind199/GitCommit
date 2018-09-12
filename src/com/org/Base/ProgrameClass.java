package com.org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgrameClass
{

	public static void main(String[] args)
	{
		System.out.println("Hello");
		System.out.println("Current path : "+System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\BrowserDrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
	}

}
