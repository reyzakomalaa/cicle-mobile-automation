Feature: Blast

  Scenario: Ensure user can see Blast page with Empty State
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Blast
    Then user will see Blast page Empty State

  Scenario: Ensure user can go to Home page from Blast page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Blast
    And user click Back to previous page
    Then show Company Home

  Scenario: Ensure user can go to Team Detail page from Blast page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Blast
    And user click dropwown
    And user click Overview
    Then user is in Team Detail page

  Scenario: Ensure user can go to Board page from Blast page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Blast
    And user click dropwown
    And user click Board
    Then user is in Board page

  Scenario: Ensure user can go to Doc & Files page from Blast page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Blast
    And user click dropwown
    And user click Doc & Files
    Then user is in Doc & Files page

  Scenario: Ensure user can go to Group Chat page from Blast page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Blast
    And user click dropwown
    And user click Group Chat
    Then user is in Group Chat page

  Scenario: Ensure user can go to Schedule page from Blast page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Blast
    And user click dropwown
    And user click Schedule
    Then user is in Schedule page