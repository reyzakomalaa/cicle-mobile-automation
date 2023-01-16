Feature: Add Company
  @Positive
  Scenario: Ensure user can create new company
    Given user in Company List page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    Then show toaster success create new Company
    Then show registered Company Name

  @Negative
  Scenario: Ensure user can not create new company if mandatory field is not filled
    Given user in Company List page
    When user click Create New Company
    And user click Create
    Then show error toaster must be filled name and description