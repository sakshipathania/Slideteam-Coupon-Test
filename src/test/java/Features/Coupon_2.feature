@Coupon_2
Feature: Apply and Remove Coupon
Scenario: Apply and Remove Coupon

Given user is already on Website Home Page ccii
Then user is redirected to pricing page and choose the plan to pay ccii
Then user is redirected checkout page ccii
Then user proceed to pay with paypal pp ccii
Then paypal popup appears and user navigates back to my account pp ccii
Then user Signout account PP ccii

