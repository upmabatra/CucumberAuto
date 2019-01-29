package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
	WebDriver driver;
	

	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");//C:\\Users\\batra\\Desktop\\Udemy\\cucumber\\drivers\\chromedriver.exe
		System.out.println("Show URL");
	}
	
	@When("^User enters user first name$")
	public void User_enters_user_first_name(){
		
		driver.findElement(By.xpath("//input[@id=\"u_0_c\"]")).sendKeys("Upma");//trying with escape for double quotes
		
	}
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present(){
		
		
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals("Upma", userNameActual);
	}

}
