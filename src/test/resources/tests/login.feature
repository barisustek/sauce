Feature: Sauce labs login test scenarios

  Scenario: TC_001_Login with error_user
    Given User opens to saucelabs
    When User sets error_user as username
    And User sets secret_sauce as password
    And User clicks login button
    Then Inventory item should be listed
    And User clicks add to first add to cart button
    And There should be 1 item in the cart
    And User clicks remove from cart button
    And There should be 0 item in the cart