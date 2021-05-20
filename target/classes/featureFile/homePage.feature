@product
Feature: Validate Product page

Background: Set Login Page Credentials
Given enter valid username "standard_user" and password "secret_sauce"

Scenario: verify About us page
Given click threeLine button
When Click AboutUs button
Then check the page is navigating to aboutus page and return back to product page
Then Select the highest price item
Then Click shopping cart link
Then Click checkout
Then EnterDetails
Then Validate Price and Click Finish