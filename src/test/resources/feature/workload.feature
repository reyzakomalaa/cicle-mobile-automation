Feature: Work Load

  Scenario: Ensure user can see Work Load page with Empty State
    Given user in Company List page
    When user click Existing Company
    And user click Menu
    And click Workload
    Then user will see Work Load page Empty State

  Scenario: Ensure user can go to Home page from Work Load page
    Given user in Company List page
    When user click Existing Company
    And user click Menu
    And click Workload
    And user click Back to previous page
    Then show Company Home