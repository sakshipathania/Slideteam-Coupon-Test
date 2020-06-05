@CO_Checkout
Feature:  2CO Checkout
Scenario: Test 2CO checkout

Given user is already on Website Home Page ii
Then user navigates to sign up page ii
Then user enter name ii
Then user enter email ii
Then user enter password and confirm password ii
Then user enter captcha ii
Then user click on register button to complete sign up ii
Then user is redirected to pricing page and choose a plan to pay 2CO
Then user is redirected to checkout page 2CO
Then user proceed to pay with 2CO 2CO
Then paypal popup appears and user navigates back to my account 2CO
Then user deleted the account 2CO
