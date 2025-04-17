Feature: Zone Manager Management
  In order to ensure effective management of zone managers
  As an administrator. I want to update zone manager in the system

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message


  Scenario: update a zone manager contract
    When the user clicks on the Zone Manager section
    And the user clicks on the update button for the zone manager
    And the user selects the Contact and Details section
    And the user enters the new contract start date "2005-01-01" for the zone manager
    And the user enters the new contract end date "2029-01-01" for the zone manager
    And the user clicks on enregistrer button
    Then the zone manager's contract is successfully updated


