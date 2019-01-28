package com.basic.DataTableSD;

import java.util.List;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDef {
	
	WebDriver driver;
	String frstName;
	String lstName;
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\batra\\Desktop\\Udemy\\cucumber\\drivers");
	
//	driver.get("https://www.facebook.com/");
	
	@Given("^User need to be on Facebook login page$")
	public void User_need_to_be_on_Facebook_login_page(){
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	}
	
/*	@When("^User enters user first name is present$")
	public void User_enters_user_first_name(String userName) throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@id=\"u_0_c\"]")).sendKeys(userName);//trying with escape for double quotes
		frstName=userName;
		Thread.sleep(1000);
		
	}
	
	@And ("^User enters surname is present$")
	public void User_enters_surname(String surName) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id=\"u_0_e\"]")).sendKeys(surName);
		lstName=surName;
		Thread.sleep(1000);
		
	}
	
	@Then("^User checks user first name is present$")
	public void User_checks_user_first_name_is_present() throws InterruptedException{
		
		//String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_1']")).getAttribute("value"); xpath by the instructor
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_c']")).getAttribute("value");//trying with single quotes in place of double quotes
		Assert.assertEquals(frstName, userNameActual);
		Thread.sleep(1000);
	}
	
	@Then("^User checks user surname is present$") 
	public void User_checks_user_surname_is_present() throws InterruptedException{
		String SurnameActual = driver.findElement(By.xpath("//input[@id=\"u_0_e\"]")).getAttribute("value");//trying with single quotes in place of double quotes
		Assert.assertEquals(lstName, SurnameActual);
		Thread.sleep(1000);
		
	}
	
	@But ("^User Mobile field should be blank$")
	public void User_Mobile_field_should_be_blank() {
		
		String userMobileActual = driver.findElement(By.xpath("//input[@id=\"u_0_h\"]")).getAttribute("value");
		Assert.assertEquals("", userMobileActual);
		
	}*/


	@When ("^Enter following data$")
	public void Enter_following_data(DataTable table) throws InterruptedException {
		
		List<List<String>> data = table.raw();
		
		String firstName = data.get(0).get(0);
		String lastName = data.get(0).get(1);
		String cell = data.get(0).get(2);
		String firstName1 = data.get(1).get(0);
		String lastName1 = data.get(1).get(1);
		String cell1 =data.get(1).get(2);
		String firstName2 = data.get(2).get(0);
		String lastName2 = data.get(2).get(1);
		String cell2 = data.get(2).get(2);
		
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys(firstName1);
		driver.findElement(By.xpath("//input[@id=\"u_0_e\"]")).sendKeys(lastName1);
		driver.findElement(By.xpath("//input[@id=\"u_0_h\"]")).sendKeys(cell1);
		Thread.sleep(5000);
		
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(cell);
		
		driver.findElement(By.xpath("//input[@id='u_0_c']")).sendKeys(firstName2);
		driver.findElement(By.xpath("//input[@id=\"u_0_e\"]")).sendKeys(lastName2);
		driver.findElement(By.xpath("//input[@id=\"u_0_h\"]")).sendKeys(cell2);
		Thread.sleep(5000);
	
		
	}
	
	@Then ("^Close browser$")
	public void Close_browser() {
		
		driver.quit();
		driver = null;
	}
}
