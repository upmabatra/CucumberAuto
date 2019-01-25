Feature: Create account of Facebook7

As a user u need to open facebook home page and do the validations


Scenario: Validate First Name field71
Given User need to be on Facebook login page
When User enters user first name "David" parameter
Then User checks user first name is present


Scenario: Validate create user multiple fields72
Given User need to be on Facebook login page
When User enters user first name "Upma" parameter
And User enters surname "Batra" parameter
Then User checks user surname is present
Then User Mobile field should be blank 
