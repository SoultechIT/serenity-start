Feature: Busca no google

  @Positive
  Scenario: Busca por resultado positivo
    Given Sergey is searching a term on google
    When ele procura por "Cucumber"
    Then a primeira url encontrada "deve" ser "https://cucumber.io/"

  @Negative
  Scenario: Busca por resultado negativo
    Given Sergey is searching a term on google
    When ele procura por "API"
    Then a primeira url encontrada "não deve" ser "https://cucumber.io/"