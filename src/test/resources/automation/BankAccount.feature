Feature: BankAccount

  Scenario: Withdraw money available in user account
    Given BankAccount has 1000 pln
    When User withdraws 500 pln
    Then Transaction should be done
    And Account balance should be 500 pln

  Scenario: Payment is not possible
    Given BankAccount has 1000 pln
    When User withdraws 1500 pln
    Then Transaction should not be done
    And Account balance should be 1000 pln

  Scenario: Withdraw and transfer money available for user
    Given BankAccount has 1000 pln
    When User withdraws 1000 pln
    And User transfer 2000 pln
    And User withdraws 500 pln
    Then Transaction should be done
    And Account balance should be 1500 pln

  Scenario: Money transfer and withdraw are not available for user
    Given BankAccount has 2000 pln
    When User withdraws 1500 pln
    And User withdraws 1500 pln
    Then Transaction should not be done
    And Account balance should be 500 pln