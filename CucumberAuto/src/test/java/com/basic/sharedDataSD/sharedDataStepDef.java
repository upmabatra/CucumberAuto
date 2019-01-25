package com.basic.sharedDataSD;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;

public class sharedDataStepDef{
	
	WebDriver driver;
	
	
	
	public sharedDataStepDef(sharedDriver share) {
	driver = share.Setup();	
	
	}
	

	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		
		driver.get("https://www.facebook.com/");
		
	}
	
	@When("^User enters user first name \"([^\"]*)\" parameter$")
	public void User_enters_user_first_name(String userName) throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@id=\"u_0_c\"]")).sendKeys(userName);//trying with escape for double quotes
		Thread.sleep(1000);		
		
	}
	
	
		
	}
	



