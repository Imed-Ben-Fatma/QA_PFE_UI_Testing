Feature: Add Zone Manager
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
    And upload the profile photo of zone manager "profileImg1.jpeg"
    And upload the cover photo of zone manager "coverImg1.jpg"

    And selects the "Information" section
    And selects status 1
    And enters the last name "Ben Fatma"
    And enters the first name "Imed"
    And enters the date of birth "1998-06-21"
    And selects gender 0
    And enters the phone number "51198800"
    And enters the email "<email>"
    And proceeds to the "Address" section
    And selects governorate 11
    And selects city 6
    And enters the address "JWG3+R7V, Moknine, Tunisia"
    And inputs GPS coordinates "35.62740822493692, 10.903136980238477"
    And moves to the "Contact and Details" section
    And sets the contract start date to "2025-02-01"
    And sets the contract end date to "2030-01-01"
    And upload the contract PDF file "Contrat1.pdf"
    And clicks the "Save" button
    Then the zone manager is successfully added
    Examples:
      | email                     |
      | imad.benfatma10@gmail.com |

  @InvalidCredentials
  Scenario Outline: Failed to add zone manager - Email invalid
    When the user navigates to the Zone Manager section
    When the user navigates to the Zone Manager section
    And clicks the "Add" button
    And selects the "Information" section
    And selects status 1
    And enters the last name "Ben Fatma"
    And enters the first name "Imed"
    And enters the date of birth "1998-06-21"
    And selects gender 0
    And enters the phone number "51198800"
    And enters the email "<email>"
    And proceeds to the "Address" section
    And selects governorate 11
    And selects city 6
    And enters the address "JWG3+R7V, Moknine, Tunisia"
    And inputs GPS coordinates "35.62740822493692, 10.903136980238477"
    And moves to the "Contact and Details" section
    And sets the contract start date to "2025-12-12"
    And sets the contract end date to "2030-01-01"
    And upload the contract PDF file "Contrat1.pdf"
    And clicks the "Save" button
    Then an error message "Email already exists" is displayed, and the zone manager is not added
    Examples:
      | email                |
      | imad.benfatma98@gmail.com  |