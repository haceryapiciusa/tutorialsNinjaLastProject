Feature: Adding the wishes Item
  Scenario: Add  item to the wish list
    Given Navigate to website
    And Click on the sign in buttton
    And Search for "dress"
    And Click on search button
    And Change the gridview to list
    And Select any item's addtowish
    And Click added to wish list pop-up to close
    And Click the view my customer account
    And Click on my wishlist
    Then Verify My wishlist displayed