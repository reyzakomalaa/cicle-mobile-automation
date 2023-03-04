Feature: Team Detail

  Scenario: Ensure user can go back to Home page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Back to previous page
    Then show Company Home

  Scenario: Ensure user can go back to Home page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    Then user is in Team Detail page

  Scenario: Ensure user can Edit Menu to not showing Group Chat from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Group Chat
    And user click Save
    Then Group Chat will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to showing Group Chat from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Group Chat
    And user click Save
    When user click Settings
    And user click Edit Menu
    And user click toggle Group Chat
    And user click Save
    Then Group Chat will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to not showing Blast from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Blast
    And user click Save
    Then Blast will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to showing Blast from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Blast
    And user click Save
    When user click Settings
    And user click Edit Menu
    And user click toggle Blast
    And user click Save
    Then Blast will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to not showing Schedule from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Schedule
    And user click Save
    Then Schedule will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to showing Schedule from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Schedule
    And user click Save
    When user click Settings
    And user click Edit Menu
    And user click toggle Schedule
    And user click Save
    Then Schedule will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to not showing Board from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Board
    And user click Save
    Then Board will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to showing Board from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Board
    And user click Save
    When user click Settings
    And user click Edit Menu
    And user click toggle Board
    And user click Save
    Then Board will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to not showing Check Ins from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Check Ins
    And user click Save
    Then Check Ins will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to showing Check Ins from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Check Ins
    And user click Save
    When user click Settings
    And user click Edit Menu
    And user click toggle Check Ins
    And user click Save
    Then Check Ins will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to not showing Doc & Files from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Doc & Files
    And user click Save
    Then Doc & Files will be disappear or appear from Team Detail page

  Scenario: Ensure user can Edit Menu to showing Doc & Files from Team Detail page
    Given user in Company List page
    When user click Existing Company
    And user click Existing Team
    And user click Settings
    And user click Edit Menu
    And user click toggle Doc & Files
    And user click Save
    When user click Settings
    And user click Edit Menu
    And user click toggle Doc & Files
    And user click Save
    Then Doc & Files will be disappear or appear from Team Detail page
