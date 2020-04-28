Feature: User is able to login into the application
  Scenario: Log into the application with valid credentials
    Given that User wants to login in order to manage his products
    When I fill my user name "carlos"
    And I fill my password "test"
    Then I should receive the "access granted" message