Feature: Create account of Facebook4

As a user u need to open facebook home page and do the validations

Background: 
Given User need to be on Facebook login page

Scenario: Validate create user with data set41
When Enter following data
	| userNameDS| surNameDS| MobileDS |
	| Tom       | Hanks    | 12345    |
	| Angie     | Crawford | 67892    |
Then Close browser