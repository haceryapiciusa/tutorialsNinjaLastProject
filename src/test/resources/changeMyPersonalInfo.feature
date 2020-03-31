Feature:Change My Personal Information
  @SmokeTest
  Scenario:Change Date of Birth

    Given Navigate to website
    And Click on the sign in buttton
    And Click view my customer account
    And Click My Personal Information
    And Change Date of Birth information
    And Click Current Password Box
    And Save Button
    Then Verify personal information upadated successfully
    