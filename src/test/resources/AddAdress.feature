Feature:Adding the Adress
  @SmokeTest
  Scenario:Add adress on your account
    Given Navigate to website
    And Click on the sign in buttton
    And Click view my customer account
    And CLick My Adresses
    And Click a new adress
    And Fill the required fields
    And Click Save button
    Then Verify new adress added
    And Delete new adress