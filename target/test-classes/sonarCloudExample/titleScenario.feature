Feature: Harry Potter Title
  Is the book selected Harry Potter?

  Scenario: Choosing the correct book
    Given The book is Harry Potter
    When I ask whether the book is Harry Potter
    Then I should be told "Yes"

  Scenario: Choosing the incorrect book
    Given The book is The Hobbit
    When I ask whether the book is Harry Potter
    Then I should be told "No"