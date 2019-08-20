@Sign_up_Incorrect_data
Feature:  Sign up with incorrect data
Scenario: Test Sign up with Incorrect Data

Given user is already on Website Home Page i
Then user navigates to sign up page i
Then user enter incorrect details to sign up i
Then error message is displayed i
Then user enter valid name i
Then user enter valid email i
Then user enter valid password and confirm password i
Then user enter valid captcha i
Then user click on register button to complete sign up i
