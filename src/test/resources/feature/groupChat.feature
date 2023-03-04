Feature: Group Chat

  Scenario: Ensure user can see Group Chat page with Empty State
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Group Chat
    Then user will see Group Chat page Empty State