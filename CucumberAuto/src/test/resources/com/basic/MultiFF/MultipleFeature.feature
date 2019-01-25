Feature: Create account of Facebook8

As a user u need to open facebook home page and do the validations

Scenario: Validate First Name field81
Given User need to be on Facebook login page
When User enters user first name
Then User checks user first name is present
Then Close browser

Scenario: Validate create user multiple fields82
Given User need to be on Facebook login page
When User enters user first name
And User enters surname
Then User checks user surname is present
Then User Mobile field should be blank 
Then Close browser