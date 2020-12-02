@Paypal_Checkout
Feature:  Paypal Checkout
Scenario: Test paypal checkout

Given user is already on Website Home Page
Then user is redirected to pricing page and choose the plan to pay
Then user proceed to pay with paypal paypal
Then paypal popup appears and user navigates back to my account pp
Then user Signout account PP

