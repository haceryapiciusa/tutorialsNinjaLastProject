Feature:Contact Us
  @SmokeTest
  Scenario: Contact Us
    Given Navigate to website
    And Click on the sign in buttton
    And Click contact us
    And Select heading
    And Email address
    And Select Order reference
    And Select Product
    And Type message
    And Click send button
    Then Verify contact us page
