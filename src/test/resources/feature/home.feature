Feature: Home
  @AddHQ
  Scenario: Ensure user can add new HQ
    Given user in Company List page
    When user click Existing Company
    When user click Add icon on Home page
    And user select Add new HQ
    And user fill Name
    And user fill Description
    And user click Create
    Then show created HQ name

  @AddHQ
  Scenario: Ensure user can not add new HQ if mandatory field is not filled
    Given user in Company List page
    When user click Existing Company
    When user click Add icon on Home page
    And user select Add new HQ
    And user click Create
    Then show error toaster must be filled name and description

  @AddTeam
  Scenario: Ensure user can add new Team
    Given user in Company List page
    When user click Existing Company
    When user click Add icon on Home page
    And user select Add new Team
    And user fill Team Name
    And user fill Description
    And user click Create
    Then show created Team name

  @AddTeam
  Scenario: Ensure user can not add new Team if mandatory field is not filled
    Given user in Company List page
    When user click Existing Company
    When user click Add icon on Home page
    And user select Add new Team
    And user click Create
    Then show error toaster must be filled name and description

  @AddProject
  Scenario: Ensure user can add new Project
    Given user in Company List page
    When user click Existing Company
    When user click Add icon on Home page
    And user select Add new Project
    And user fill Name
    And user fill Description
    And user click Create
    Then show created Project name

  @AddProject
  Scenario: Ensure user can not add new Project if mandatory field is not filled
    Given user in Company List page
    When user click Existing Company
    When user click Add icon on Home page
    And user select Add new Project
    And user click Create
    Then show error toaster must be filled name and description

  @AddMember
  Scenario: Ensure user can invite new Member
    Given user in Company List page
    When user click Existing Company
    When user click Add New Member icon on Home page
    And user fill Member Email
    And user click Send
    Then show toaster success invitation has been sent

  Scenario: Ensure user can see HQ section with Empty State
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    Then user will see HQ section Empty State

  Scenario: Ensure user can see Team section with Empty State
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    Then user will see Team section Empty State

  Scenario: Ensure user can Login
    Given user in Company List page
    When user click Existing Company
    Then show Company Home