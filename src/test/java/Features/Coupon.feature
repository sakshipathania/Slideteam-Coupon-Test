@Coupon
Feature:  Coupon
Scenario: Coupon

Given user is already on Website Home Page
Then user is redirected to pricing page and choose the plan to pay
Then user is redirected checkout page
Then user proceed to pay with paypal pp
Then paypal popup appears and user navigates back to my account pp
Then user Signout account PP
