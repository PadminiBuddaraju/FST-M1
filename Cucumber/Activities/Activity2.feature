@activity2
Feature: Activity to test the login feature

  @loginTest
  Scenario: Successful login
    Given the user is on login page
    When the user enters username and password
    And clicks the submit button
    Then get the confirmation text and verify message