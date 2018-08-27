Feature: Search Trip on Expedia
  
  
  Background: init browser
  Given Open init browser
  
  Scenario: Search normal
    When Click on Flights
    Then Enter information
    And Click on Search
    Then Check validate information
    And Close init browser
