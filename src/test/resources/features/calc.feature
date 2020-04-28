Feature: sum two numbers

  Scenario:The user is able to sum numbers
    Given I want to sum two numbers
    When the first number is <23>
    And the second is <6>
    Then the result is <29>
