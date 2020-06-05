@Paypal_Checkout
Feature:  Paypal Checkout
Scenario: Test paypal checkout

Given user is already on Website Home Page ii
Then user user navigates to sign up page ii
Then user_enter_name_ii
Then user enter email ii
Then user enter password and confirm password ii
Then user enter captcha ii
Then user click on register button to complete sign up ii
Then user is redirected to pricing page and choose a plan to pay
Then user is redirected to checkout page
Then user proceed to pay with paypal
Then paypal popup appears and user navigates back to my account pp
Then user deleted the account

