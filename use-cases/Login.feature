Feature:
  admin login

  Scenario: valid login
    Given The admin chose to login
    When  The admin login with valid credentials
    Then  The admin is directed to the homepage
    And   The admin gets a greeting message

  Scenario: invalid password
    Given The admin chose to login
    When  The admin logs in with the wrong password
    Then  The admin receives a warning message that it is wrong
    And   clears the typed password


