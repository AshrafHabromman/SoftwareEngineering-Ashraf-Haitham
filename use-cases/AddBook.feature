Feature: Adding a book


  Scenario: User is logged in
    Given Admin tries to add a book
    When  The admin is logged in
    Then  Book is added successfully
    And   Message shows that the book is added

    Scenario: User is not logged in
      Given User tries to add a book
      When  The user is not logged in
      Then  Book cannot be added
      And   Message shows that it is and admin feature




