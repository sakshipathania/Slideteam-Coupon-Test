@Coupon_3
Feature:  Apply Coupon
Scenario: Apply Coupon

Given user is already on Website Home Page cciii
Then user is redirected to pricing page and choose the plan to pay cciii
Then user is redirected checkout page cciii
Then user proceed to pay with paypal pp cciii
Then paypal popup appears and user navigates back to my account pp cciii
Then user Signout account PP cciii

