@Test3
Feature: Buy computer from shopping site

  Scenario: User buys cheap computer
    Given User Logged in to the shopping cart
    When User go to computer menu and select desktops
    And User chooses build you own cheap computer
    And User add it to cart and accept Ts and Cs and checkout
    And User Complete billing and shipping details and chooses payment method as COD
    Then User confirms Orders and capture order number




