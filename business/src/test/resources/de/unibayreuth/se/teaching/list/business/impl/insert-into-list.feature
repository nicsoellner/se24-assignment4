Feature: InsertIntoListTests
  This feature insert elements to the list.

  Scenario: Insert one element to the list
    Given an empty list
    When I append an element with value 0.1
    Then the list should contain 1 element
    And the list should contain that element

  Scenario: Append multiple elements to an empty list
    Given an empty list
    When I append an element with value 0.3
    And I append an element with value 0.2
    Then the list should contain 2 elements
    And it should be sorted


  Scenario: Insert an element in the middle of the list
    Given I have elements with the following values in my list:
      | 0.1 |
      | 0.3 |
    When I append an element with value 0.2
    Then the list should contain 3 elements
    And it should be sorted
