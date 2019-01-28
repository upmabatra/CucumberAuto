package com.basic.sharedDataSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;


public class sharedDataStepDef2 {
	
	WebDriver driver;
	
	
	public sharedDataStepDef2(sharedDriver share) {
		driver = share.Setup();	
		
		}
	

	
	@Then("^User checks user first name \"([^\"]*)\" is present$")
	public void User_checks_user_first_name_is_present(String userName) throws InterruptedException{
		

		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");
		Assert.assertEquals(userName, userNameActual);
		Thread.sleep(1000);
	}
	


}
