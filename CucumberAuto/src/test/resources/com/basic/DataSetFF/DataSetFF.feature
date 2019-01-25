Feature: Create account of Facebook5

As a user u need to open facebook home page and do the validations

Background: 
Given User need to be on Facebook login page

Scenario Outline: Validate create user multiple fields51
When User enters user first name "<userName>" parameter
And User enters surname "<surName>" parameter
Then User checks user surname is present
Then User Mobile field should be blank 
Then Close browser
Examples:
	| userName | surName |
	| Tom      | Jerry   |
	| Basant   | Panchami|
	| Lorren   | Hardy   |