Feature: Create account of Facebook3

As a user u need to open facebook home page and do the validations


Scenario: Validate First Name field31
Given User need to be on Facebook login page
When User enters user first name "David" parameter
Then User checks user first name is present
Then Close browser

Scenario: Validate create user multiple fields32
Given User need to be on Facebook login page
When User enters user first name "Upma" parameter
And User enters surname "Batra" parameter
Then User checks user surname is present
Then User Mobile field should be blank 
Then Close browser