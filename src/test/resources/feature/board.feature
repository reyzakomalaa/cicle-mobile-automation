Feature: Board
  @Positive
  Scenario: Ensure user can access Board page
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Name
    And user fill Description
    And user click Create
    When user click Team
    And user click Board
    Then user is in Board page

  @Positive
  Scenario: Ensure user can create Board List
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Name
    And user fill Description
    And user click Create
    When user click Team
    And user click Board
    When user click Create List
    And user fill List Name
    And user click Submit
    Then show created List name

  @Positive
  Scenario: Ensure user can create Card on Board
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Name
    And user fill Description
    And user click Create
    When user click Team
    And user click Board
    When user click Create List
    And user fill List Name
    And user click Submit
    When user click Add New Card
    And user fill Card Name
    And user click Checklist button
    Then show created Card on Board

  @Positive
  Scenario: Ensure user can create Private Card on Board
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Name
    And user fill Description
    And user click Create
    When user click Team
    And user click Board
    When user click Create List
    And user fill List Name
    And user click Submit
    When user click Add New Card
    And user fill Card Name
    And user enable Private toggle
    And user click Checklist button
    Then show created Card on Board

  @Positive
  Scenario: Ensure user can archived List
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Name
    And user fill Description
    And user click Create
    When user click Team
    And user click Board
    When user click Create List
    And user fill List Name
    And user click Submit
    When user click three dots navigation on List
    And user click Archive this list
    Then show toaster List has been moved to Archived

  Scenario: Ensure user can unarchived List
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Name
    And user fill Description
    And user click Create
    When user click Team
    And user click Board
    When user click Create List
    And user fill List Name
    And user click Submit
    When user click three dots navigation on List
    And user click Archive this list
    When user click Archived icon
    And user click navbar icon
    And user click Restore
    And user click Ok
    Then show toaster success Unarchiving List
    Then show created List name

  Scenario: Ensure user can archived List
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Name
    And user fill Description
    And user click Create
    When user click Team
    And user click Board
    When user click Create List
    And user fill List Name
    And user click Submit
    When user click three dots navigation on Card
    And user click Archive this list
    Then show toaster Card has been moved to Archived