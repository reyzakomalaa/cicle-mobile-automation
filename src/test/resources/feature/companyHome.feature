Feature: Home
  @Positive
  Scenario: Ensure user can add new HQ
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new HQ
    And user fill Name
    And user fill Description
    And user click Create
    Then show created HQ name

  @Negative
  Scenario: Ensure user can not add new HQ if mandatory field is not filled
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new HQ
    And user click Create
    Then show error toaster must be filled name and description

  @Positive
  Scenario: Ensure user can add new Team
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
    Then show created Team name

  @Negative
  Scenario: Ensure user can not add new Team if mandatory field is not filled
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Team
    And user click Create
    Then show error toaster must be filled name and description

  @Positive
  Scenario: Ensure user can add new Project
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Project
    And user fill Name
    And user fill Description
    And user click Create
    Then show created Project name

  @Negative
  Scenario: Ensure user can not add new Project if mandatory field is not filled
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    When user click Add icon on Home page
    And user select Add new Project
    And user click Create
    Then show error toaster must be filled name and description