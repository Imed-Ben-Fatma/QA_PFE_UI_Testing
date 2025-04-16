Feature: add packs

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message


  Scenario: Add QR Code Packs Successfully
    When the user clicks on the Packs section button
    And the user clicks on the "Add Packs" button
    And the user enters the number of packs as "2"
    And the user enters the number of QR codes per pack as "10"
    And the user clicks on the "Save Packs" button
    Then the packs should be added successfully


