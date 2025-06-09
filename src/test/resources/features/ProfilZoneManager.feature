Feature: Profile Zone Manager

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario: Successfully consult a zone manager
    When the user navigates to the Zone Manager section
    And the list of zone managers is displayed
    And the user selects the first zone manager
    And the page title is correct
    And the Basic Information section is displayed
    And the user clicks on Location button
    And the Location section is displayed
    And the user clicks on team button
    Then the Team section is displayed

