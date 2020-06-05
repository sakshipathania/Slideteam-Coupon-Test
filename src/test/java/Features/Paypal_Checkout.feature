@Paypal_Checkout
Feature:  Paypal Checkout
Scenario: Test paypal checkout

Given user is already on Website Home Page
Then user navigates to sign up page
Then user enter name
Then user enter email
Then user enter password and confirm password
Then user enter captcha
Then user click on register buton to complete sign up
Then user is redirected to pricing page and choose the plan to pay
Then user is redirected checkout page
Then user proceed to pay with paypal
Then paypal popup appears and user navigates back to my account pp
Then user deletes account

