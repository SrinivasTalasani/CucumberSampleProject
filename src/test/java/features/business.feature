@InspiredTest
Feature: Buy computer from shopping site

  Scenario Outline: User buys cheap computer
    Given User Logged in to the shopping site with username "<username>" and password "<password>"
    When User go to computer menu and select desktops
    And User chooses build you own cheap computer as "<product>"
    And User add it to cart and accept Ts and Cs and checkout
    And User Complete billing and shipping details and chooses payment method as COD
    Then User confirms Orders and capture order number

    Examples:
      | username                | password  | product                      |
      | srinitalasani@gmail.com | Sriraju@5 | build you own cheap computer |


