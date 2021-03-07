Feature: Adding a book


  Scenario: Admin is logged in
    Given Admin tries to add a book And  is logged in
    When  The admin enter the information of the book and valid ISBN
    Then  Book is added successfully
    And   Message shows that the book is added

    Scenario: Admin is not logged in
      Given Admin is not logged in
      When  Admin tries to add a book
      Then  Book cannot be added
      And   Message shows that you have to log in




