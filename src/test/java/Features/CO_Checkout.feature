@CO_Checkout
Feature:  2CO Checkout
Scenario: Test 2CO checkout

Given user is already on Website Home Page CO
Then user navigates to sign up page CO
Then user enter name CO
Then user enter email CO
Then user enter password and confirm password CO
Then user enter captcha CO
Then user click on register button to complete sign up CO
Then user is redirected to pricing page and choose a plan to pay 2CO
Then user proceed to pay with 2CO 2CO
Then 2CO page appears and user navigates back to my account 2CO
Then user signout the account 2CO
