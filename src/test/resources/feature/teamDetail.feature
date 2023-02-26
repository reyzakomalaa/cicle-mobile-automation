Feature: Team Detail

  Scenario: a user, I can go back to Home page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    Then user is in Team Detail page