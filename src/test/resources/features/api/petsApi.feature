Feature: Simple pets api example

  @api
  Scenario: Add a new pet in pet store
    Given I add a new pet to the store
    Then pet should be available