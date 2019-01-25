Feature: Create account of Facebook12

As a user u need to open facebook home page and do the validations

Background: common login step
Given User need to be on Facebook login page

Scenario: Validate First Name field121
When User enters user first name "David" parameter
Then User checks user first name is present
Then Close browser

Scenario: Validate create user multiple fields122
When User enters user first name "Upma" parameter
And User enters surname "Batra" parameter
Then User checks user surname is present
Then User Mobile field should be blank 
Then Close browser