Feature: Inbox

  Scenario: Ensure user can see Inbox page with Empty State
    Given user in Company List page
    When user click Existing Company
    And user click Menu
    And user click Inbox
    Then user will see Inbox page Empty State

  Scenario: Ensure user can go to Home page from Inbox page
    Given user in Company List page
    When user click Existing Company
    And user click Menu
    And user click Inbox
    And user click Back to previous page
    Then show Company Home