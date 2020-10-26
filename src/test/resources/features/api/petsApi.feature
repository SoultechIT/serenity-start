@api
Feature: Simple pets api example

  Background:

  @postivo
  Scenario: Add a new pet in pet store
    Given I add a new pet to the store
    Then pet should be available

    @negativo
    Scenario: alsdljaskldjkjasd
      Given I add a new pet to the store
      Then I update the pet in the store

