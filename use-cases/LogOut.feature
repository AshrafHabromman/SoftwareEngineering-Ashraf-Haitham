Feature:
  admin logout
Background:
  Scenario:
  Scenario: Admin logs out
    Given The admin chose to logout
    When  The admin is logged in
    Then  The admin is directed to the login page
    And   The admin gets a goodbye message







