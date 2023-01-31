Feature: Bing search

  @bing
  Scenario Outline: I want to search on bing site
    Given I am on the bing site
    When I enter "<keyword>" as a keyword
    Then I should see search results page
    Then I should see at least <count> results

    Examples:
      | keyword     | count       |
      | selenium    | 2           |
      | java        | 5           |
      | spring      | 37          |