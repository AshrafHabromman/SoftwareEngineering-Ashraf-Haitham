Feature: Search for a book

  Scenario: Search by title
    Given The user types a substring book title
    When  The book exists in the library
    Then  The book appears to the user with all info

  Scenario: Search by author
    Given The user types a substring book author
    When  The book exists in the library for author
    Then  The book appears to the user with all info for author

  Scenario: Search by ISBN
    Given The user types a  valid book ISBN
    When  The books isbn exists in the library
    Then  The book with the isbn appears to the user with all info

  Scenario: No books match the criteria
    Given  The user searches for a book
    When   The book doesn't exist in the library
    Then   No book found


    Scenario: More than one book found
      Given  The user searches for a book
      When   More than one book match the criteria
      Then   Show all results























