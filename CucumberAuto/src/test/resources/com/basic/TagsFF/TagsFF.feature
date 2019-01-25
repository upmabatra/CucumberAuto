@Important
Feature: Create account of Facebook6
As a user u need to open facebook home page and do the validations

@Regression
Scenario: Validate First Name field61
Given User need to be on Facebook login page
When User enters user first name "Regression" parameter
Then User checks user first name is present
Then Close browser

@Regression @Smoke
Scenario: Validate First Name field62
Given User need to be on Facebook login page
When User enters user first name "RegressionNSmoke" parameter
Then User checks user first name is present
Then Close browser

@Smoke
Scenario: Validate create user multiple fields63
Given User need to be on Facebook login page
When User enters user first name "Smoke" parameter
Then User enters surname "Only" parameter
Then User checks user surname is present
Then User Mobile field should be blank 
Then Close browser


Scenario: Validate First Name field64
Given User need to be on Facebook login page
When User enters user first name "David" parameter
Then User checks user first name is present
Then Close browser

@Smoke
Scenario: Validate create user multiple fields65
Given User need to be on Facebook login page
When User enters user first name "Upma" parameter
Then User enters surname "Smoke" parameter
Then User checks user surname is present
Then User Mobile field should be blank 
Then Close browser