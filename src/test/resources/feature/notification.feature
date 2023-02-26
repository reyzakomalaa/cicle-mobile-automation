Feature: Notification

  Scenario: Ensure user can see Notification page with Empty State
    Given user in Company List page
    When user click Existing Company
    And user click Notification icon
    Then user will see Notification page Empty State

  Scenario: Ensure user can go to Home page from Notification page
    Given user in Company List page
    When user click Existing Company
    And user click Home icon
    Then show Company Home