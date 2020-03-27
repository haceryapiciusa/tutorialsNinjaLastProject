Feature: Buy Item
  Scenario: Buy item
    Given Navigate to website
    And Click on the sign in buttton
    And Search for "dress"
    And Click on search button
    And Change the gridview to list
    And Select any of the item
    And Switch to the frame
    And Click on the add to wish list
    And Click added to wish list pop-up to close
    And Click button to close frame
    And Click the view my customer account
    And Click on my wishlist
    Then Verify the wishlist