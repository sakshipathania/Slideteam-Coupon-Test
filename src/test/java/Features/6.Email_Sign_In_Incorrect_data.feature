@sign_in_via_email_with_Incorrect_Data
Feature: paid User Sign In via Email
Scenario: Test Sign in for paid User via Email 

Given user is already on Home Page of Geeks Website vi
Then user navigates to login page vi
Then user login to website with invalid email and password vi
Then validate the error message vi