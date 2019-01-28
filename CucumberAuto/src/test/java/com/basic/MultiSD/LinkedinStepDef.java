package com.basic.MultiSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LinkedinStepDef {
	
	WebDriver driver;

	
	@Given("^User need to be on linkedin page$")
	public void user_need_to_be_on_linkedin_page(){
		
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
	}
	
	@When("^User enters email$")
	public void user_enters_email() throws InterruptedException{
		
		driver.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("Upma");
		Thread.sleep(1000);
		
	}
	
	@Then("^User checks email is present$")
	public void user_checks_email_is_present() throws InterruptedException{
		

		String userNameActual = driver.findElement(By.xpath("//*[@id=\"login-email\"]")).getAttribute("value");
		Assert.assertEquals("Upma", userNameActual);
		Thread.sleep(1000);
	}
	
	@Then ("^Close linkedin browser$")
	public void close_linkedin_browser() {
		
		driver.quit();
		driver = null;
	}

}
