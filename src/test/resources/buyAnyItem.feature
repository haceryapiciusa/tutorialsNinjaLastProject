Feature: Buy Item
  Scenario: Buy item
    Given Navigate to website
    And Click on the sign in buttton
    And Search for "dress"
    And Click on search button
    And Click on any item
    And Click on proceed to checkout
    And Click on Agree the terms button
    And Click on bank payment
    And Click on confirm button
    Then verify i am in the confirmation page

