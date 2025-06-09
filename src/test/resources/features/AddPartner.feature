Feature: Add Partner


  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario: Successfully add a partner
    When the user navigates to the partner And Announcer section
    When the user navigates to the partner section
    And clicks the "Add" button of partner

    And upload the profile photo of partner "profileImg1.jpeg"
    And upload the cover photo of partner "coverImg1.jpg"

    And selects the "Information" section of partner
    And enters the Project Name of partner "Car4You"
    And selects Partner Announcer or no 0
    And enters the description of partner "brand of services Cars"
    And enters the Company Name of partner "Car4You"
    And enters the phone number of partner "25950758"
    And selects Project Category of partner 1
    And selects Account Status of partner 1
    And selects Project type brand of partner 1
    And selects Project type of partner 0
    And enters the responsible first name of partner "jon"
    And enters the responsible last name of partner "jon"
    And enters the responsible phone number of partner "99999999"
    And enters the email of partner "partner98@partner.com"
    And selects the "Coordonnees" section of partner
    And enters the Website of partner "Website.com"
    And enters the facebook of partner "facebook.com"
    And enters the instagram of partner "instagram.com"
    And enters the LinkedIn of partner "LinkedIn.com"
    And selects governorate of partner 0
    And selects city of partner 0
    And enters the address of partner "8R9C+XJ Nadhour, Tunisia"
    And inputs GPS coordinates of partner "37.319944534433745, 9.82159571875"
    And moves to the "Contact and Details" section of partner
    And sets the contract start date of partner "2025-02-02"
    And sets the contract end date of partner "2027-06-9"
    And selects Cumulative Discounts ok
    And upload the contract PDF file or partner "Contrat1.pdf"
    And selects Tax identification type of partner 1
    And enters the Tax identification number of partner "45rd54a"
    And selects Vehicle 1 Type of partner 2
    And selects Vehicle 1 brand of partner 2
    And clicks the "add Vehicle" button
    And selects Vehicle 2 Type of partner 0
    And selects Vehicle 2 brand of partner 3
    And selects Working Day 1 of partner 1
    And enters the start Hour day 1 of partner "8"
    And enters the start Min day 1 of partner "30"
    And enters the end Hour day 1 of partner "16"
    And enters the end Min day 1 of partner "00"
    And clicks the "add day" button
    And selects Working Day 2 of partner 1
    And enters the start Hour day 2 of partner "8"
    And enters the start Min day 2 of partner "30"
    And enters the end Hour day 2 of partner "16"
    And enters the end Min day 2 of partner "00"
    And clicks the "Save" button of partner
    Then the partner should be added successfully

  @InValidCredentials
  Scenario: Failed to add Partner - Email already in use
    When the user navigates to the partner And Announcer section
    When the user navigates to the partner section
    And clicks the "Add" button of partner

    And upload the profile photo of partner "profileImg1.jpeg"
    And upload the cover photo of partner "coverImg1.jpg"

    And selects the "Information" section of partner
    And enters the Project Name of partner "Car4You"
    And selects Partner Announcer or no 0
    And enters the description of partner "brand of services Cars"
    And enters the Company Name of partner "Car4You"
    And enters the phone number of partner "25950758"
    And selects Project Category of partner 1
    And selects Account Status of partner 1
    And selects Project type brand of partner 1
    And selects Project type of partner 0
    And enters the responsible first name of partner "jon"
    And enters the responsible last name of partner "jon"
    And enters the responsible phone number of partner "99999999"
    And enters the email of partner "partner@email.com"
    And selects the "Coordonnees" section of partner
    And enters the Website of partner "Website.com"
    And enters the facebook of partner "facebook.com"
    And enters the instagram of partner "instagram.com"
    And enters the LinkedIn of partner "LinkedIn.com"
    And selects governorate of partner 0
    And selects city of partner 0
    And enters the address of partner "8R9C+XJ Nadhour, Tunisia"
    And inputs GPS coordinates of partner "37.319944534433745, 9.82159571875"
    And moves to the "Contact and Details" section of partner
    And sets the contract start date of partner "2025-02-02"
    And sets the contract end date of partner "2027-06-9"
    And selects Cumulative Discounts ok
    And upload the contract PDF file or partner "Contrat1.pdf"
    And selects Tax identification type of partner 1
    And enters the Tax identification number of partner "45rd54a"
    And selects Vehicle 1 Type of partner 2
    And selects Vehicle 1 brand of partner 2
    And clicks the "add Vehicle" button
    And selects Vehicle 2 Type of partner 0
    And selects Vehicle 2 brand of partner 3
    And selects Working Day 1 of partner 1
    And enters the start Hour day 1 of partner "8"
    And enters the start Min day 1 of partner "30"
    And enters the end Hour day 1 of partner "16"
    And enters the end Min day 1 of partner "00"
    And clicks the "add day" button
    And selects Working Day 2 of partner 1
    And enters the start Hour day 2 of partner "8"
    And enters the start Min day 2 of partner "30"
    And enters the end Hour day 2 of partner "16"
    And enters the end Min day 2 of partner "00"
    And clicks the "Save" button of partner
    Then an error message Email already exists is displayed, and the partner is not added