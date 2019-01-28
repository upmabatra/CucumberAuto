package com.basic.hooksSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hooksStepDef {
	
	WebDriver driver;
	String frstName;
	String lstName;

	
	@Before(order=1)
	public void BeforeSetup() {
		System.out.println("In before 1");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Before(order=2)
	public void BeforeSetup2() {
     System.out.println("In before 2");
	}
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		
		
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	}
	
	@When("^User enters user first name \"([^\"]*)\" parameter$")
	public void User_enters_user_first_name(String userName) throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@id=\"u_0_c\"]")).sendKeys(userName);//trying with escape for double quotes
		frstName=userName;
		Thread.sleep(1000);
		
	}
	
	@And ("^User enters surname \"([^\"]*)\" parameter$")
	public void User_enters_surname(String surName) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id=\"u_0_e\"]")).sendKeys(surName);
		lstName=surName;
		Thread.sleep(1000);
		
	}
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present() throws InterruptedException{
		
		
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals(frstName, userNameActual);
		Thread.sleep(1000);
	}
	
	@Then("^User checks user surname is present$") 
	public void User_checks_user_surname_is_present() throws InterruptedException{
		String SurnameActual = driver.findElement(By.xpath("//input[@id=\"u_0_e\"]")).getAttribute("value");
		Assert.assertEquals(lstName, SurnameActual);
		Thread.sleep(1000);
		
	}
	
	@Then ("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank() {
		
		String userMobileActual = driver.findElement(By.xpath("//input[@id=\"u_0_h\"]")).getAttribute("value");
		Assert.assertEquals("", userMobileActual);
		
	}
	

	@After(order=1)
	public void AfterSetup() {
		System.out.println("In after 1");
		driver.quit();
		driver = null;
		
	}
	
	@After(order=2)
	public void AfterSetup2() {
		System.out.println("In after 2");
		
	}

}
