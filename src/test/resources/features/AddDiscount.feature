Feature: Add Discount

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message
  @ValidCredentials
  Scenario: Successfully add a Discount
    When the user clicks on Remise&Offer
    And the user clicks on Discount
    And the user clicks on ajoute remise button
    And the user selects mode de selection 0
    And the user selects partenaire associé 0
    And the user enters Title Discount "oil change"
    And the user enters Discount rate "25"
    And the user enters Description of discount "change oil of your car"
    And the user selects Type of discount 0
    And the user enters start date discount "2025/07/12"
    And the user clicks on save discount button
    Then the discount should be added successfully

  @InvalidCredentials
  Scenario: Failed to add a Discount - start date invalid
    When the user clicks on Remise&Offer
    And the user clicks on Discount
    And the user clicks on ajoute remise button
    And the user selects mode de selection 0
    And the user selects partenaire associé 0
    And the user enters Title Discount "oil change"
    And the user enters Discount rate "25"
    And the user enters Description of discount "change oil of your car"
    And the user selects Type of discount 0
    And the user enters start date discount "2025-07-2025"
    And the user clicks on save discount button
    Then the discount should be added unsuccessfully