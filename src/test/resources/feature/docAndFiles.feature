Feature: Doc And Files

  Scenario: Ensure user can see Doc And Files page with Empty State
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Doc & Files
    Then user will see Doc & Files page Empty State