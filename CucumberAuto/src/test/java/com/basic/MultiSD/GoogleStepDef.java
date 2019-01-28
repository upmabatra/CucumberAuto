package com.basic.MultiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
	WebDriver driver;
	

	
	@Given("^User need to be on Google page$")
	public void user_need_to_be_on_Google_page(){
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	}
	
	@When("^User enters user searches for coding in search bar$")
	public void user_enters_user_searches_for_coding_in_search_bar() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Coding");//trying with escape for double quotes
		Thread.sleep(1000);
		
	}

	
	@Then ("^Close Google browser$")
	public void Close_Google_browser() {
		
		driver.quit();
		driver = null;
	}

}
