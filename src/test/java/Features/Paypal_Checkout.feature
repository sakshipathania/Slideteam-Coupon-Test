@Paypal_Checkout
Feature:  Paypal Checkout
Scenario: Test paypal checkout

Given user is already on Website Home Page
Then user is redirected to pricing page and check the text1 PP1
Then user is redirected to pricing page and check the text2 PP2
Then user is redirected to pricing page and check the text3 PP3
Then user is redirected to pricing page and check the text4 PP4
Then user is redirected to pricing page and check the text5 PP5
Then user is redirected to pricing page and check the text6 PP6
Then user is redirected to pricing page and check the text7 PP7
Then user is redirected to pricing page and check the text8 PP8
Then user is redirected to pricing page and choose the plan to pay
Then user is redirected checkout page
Then user proceed to pay with paypal pp
Then paypal popup appears and user navigates back to my account pp
Then user Signout account PP

