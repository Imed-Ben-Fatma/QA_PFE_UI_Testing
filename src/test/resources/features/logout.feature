Feature: logout

  Background:
    Given the user is on the login page
    When the user enters a email as "admin"
    And the user enters a password as "admin"
    And clicks on the login button
    Then the user should see a successful login message

  @ValidCredentials
  Scenario: Logout successfully
    Given the user is on the home page
    When the user clicks the account avatar
    And the user clicks the logout button
    Then the user should be redirected to the login page