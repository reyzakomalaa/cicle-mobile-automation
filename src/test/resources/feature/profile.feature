Feature: Profile

  Scenario: Ensure user can go back to Home page
    Given user in Company List page
    When user click Existing Company
    When user click Menu
    And user click Email
    And user click Back to previous page
    Then show Company Home

  Scenario: Ensure user can go to previous page
    Given user in Company List page
    When user click Existing Company
    When user click Menu
    And user click Email
    And user click Edit icon
    And user click Back to previous page
    Then show Company Home

  @ChangeName
  Scenario: Ensure user can change my Name
    Given user in Company List page
    When user click Existing Company
    When user click Menu
    And user click Email
    And user click Edit icon
    And user Change Name
    And user click Save icon
    Then user's name will be changed

  @ChangeTitle
  Scenario: Ensure user can change my Title
    Given user in Company List page
    When user click Existing Company
    When user click Menu
    And user click Email
    And user click Edit icon
    And user Change title
    And user click Save icon
    Then user's title will be changed

  @ChangeAboutMe
  Scenario: Ensure user can change my About Me
    Given user in Company List page
    When user click Existing Company
    When user click Menu
    And user click Email
    And user click Edit icon
    And user Change About Me
    And user click Save icon
    Then user's About Me will be changed

  Scenario: Ensure user can not Edit Profile IF mandatory field has not been filled
    Given user in Company List page
    When user click Existing Company
    When user click Menu
    And user click Email
    And user click Edit icon
    And user clear all field
    And user click Save icon
    Then show error toaster name must be filled