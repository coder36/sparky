Feature: As a customer I want to view my bill

  Scenario: Viewing my bill
    When I view my bill
    Then I should see:
      | 26 Jan - 25 Feb |
