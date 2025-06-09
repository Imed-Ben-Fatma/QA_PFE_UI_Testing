Feature: Zone Manager Management
  In order to ensure effective management of zone managers
  As an administrator
  I want to edit a zone manager

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario: update a zone manager contract
    When the user navigates to the Zone Manager section
    And the user clicks on the update button for the zone manager
    And moves to the "Contact and Details" section
    And the user enters the new contract start date "2025-05-03" for the zone manager
    And the user enters the new contract end date "2029-06-29" for the zone manager
    And clicks the "Save" button
    Then the zone manager's contract is successfully updated
  @InvalidCredentials
  Scenario: Failed to update a zone manager - start date invalid
    When the user navigates to the Zone Manager section
    And the user clicks on the update button for the zone manager
    And moves to the "Contact and Details" section
    And the user enters the new contract start date "uiy" for the zone manager
    And the user enters the new contract end date "2029-01-01" for the zone manager
    Then the Zone manager should be updated unsuccessfully