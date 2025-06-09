Feature: Add Packs
  To ensure efficient Packs management
  As an administrator
  I would like to add a Pack to the system

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario: Add QR Code Packs Successfully
    When the user clicks on the Packs section button
    And the user clicks on the "Add Packs" button
    And the user enters the number of packs as "2"
    And the user enters the number of QR codes per pack as "5"
    And the user clicks on the "Save Packs" button
    Then the packs should be added successfully
