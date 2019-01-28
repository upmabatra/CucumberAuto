package com.basic.sharedDataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class sharedDriver {
	
	WebDriver driver;
	
	

	@Before(order=1)
	public WebDriver Setup() {
		System.out.println("In before 1");
		if(driver==null){
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
		return driver;
	}
	
	@After
	public void teardown() {
		System.out.println("In after 1");
		driver.quit();
		driver = null;
		}
}