Feature: Fantasy Genre
  Is the genre of the book selected Fantasy?

  Scenario: Choosing the correct genre
    Given The genre is Fantasy
    When I ask whether the genre is Fantasy
    Then I should be told "Yes"

  Scenario: Choosing the incorrect genre
    Given The genre is Horror
    When I ask whether the genre is Fantasy
    Then I should be told "No"