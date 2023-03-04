Feature: Check Ins

  Scenario: Ensure user can see Check Ins page with Empty State
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Check Ins
    Then user will see Check Ins page Empty State