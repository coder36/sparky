Feature: As a customer I want to view my bill


  Scenario: I should see the period the bill covers
    When I view my bill
    Then I should see:
      | 26 Jan - 25 Feb |

  Scenario: I should see my subscriptions
    When I view my bill
    Then I should see:
      | Variety with Movies HD (tv) | £50.00 |
      | Sky Talk Anytime (talk      | £5.00  |
      | Fibre Unlimited (broadband) | £16.40 |
