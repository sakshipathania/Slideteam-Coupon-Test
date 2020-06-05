@CO_Checkout
Feature:  2CO Checkout
Scenario: Test 2CO checkout

Given user is already on Website Home Page
Then user navigates to sign up page
Then user user enter name
Then user enter email
Then user enter password and confirm password
Then user enter captcha
Then user click on register button to complete sign up
Then user is redirected to pricing page and choose a plan to pay 2CO
Then user is redirected to checkout page 2CO
Then user proceed to pay with 2CO 2CO
Then paypal popup appears and user navigates back to my account 2CO
Then user deleted the account 2CO
