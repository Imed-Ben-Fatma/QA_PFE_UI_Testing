Feature: Zone Manager Management
  In order to ensure effective management of zone managers
  As an administrator
  I want to add or cancel the addition of a zone manager in the system

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario Outline: Successfully add a zone manager
    When the user navigates to the Zone Manager section
    And clicks the "Add" button

    And selects the "Information" section
    And selects status 1
    And enters the last name "Dupont"
    And enters the first name "Jean"
    And enters the date of birth "01/01/1996"
    And selects gender 1
    And enters the phone number "012345678"
    And enters the email "<email>"
    And proceeds to the "Address" section
    And selects governorate 2
    And selects city 3
    And enters the address "123 Main Street"
    And inputs GPS coordinates "36.8000, 10.1667"
    And moves to the "Contact and Details" section
    And sets the contract start date to "2021-01-01"
    And sets the contract end date to "2023-01-01"
    And uploads the contract PDF file
    And clicks the "Save" button
    Then the zone manager is successfully added
    Examples:
      | email                |
      | exemple4@exemple.com |

  @InvalidCredentials
  Scenario Outline: Failed to add zone manager - Email already in use
    When the user navigates to the Zone Manager section
    And clicks the "Add" button

    And selects the "Information" section
    And selects status 1
    And enters the last name "Dupont"
    And enters the first name "Jean"
    And enters the date of birth "01/01/1996"
    And selects gender 1
    And enters the phone number "012345678"
    And enters the email "<email>"
    And proceeds to the "Address" section
    And selects governorate 2
    And selects city 3
    And enters the address "123 Main Street"
    And inputs GPS coordinates "36.8000, 10.1667"
    And moves to the "Contact and Details" section
    And sets the contract start date to "2021-01-01"
    And sets the contract end date to "2023-01-01"
    And uploads the contract PDF file
    And clicks the "Save" button
    Then an error message "Email already exists" is displayed, and the zone manager is not added
    Examples:
      | email                |
      | exemple2@exemple.com |