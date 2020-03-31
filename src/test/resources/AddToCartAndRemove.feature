Feature: Add to cart and remove
  @SmokeTest
  Scenario: Add to cart and remove
    Given Navigate to website
    And Click on the sign in buttton
    And Search for "dress"
    And Click on search button
    And Click on any item
    And Click on proceed checkout
    And Click on the delete button
    Then Verify "Your shopping cart is empty."


