@Selenium

Feature: UserPath Feature f

  Scenario: A User can not login without an account
    Given I am at the HomePage
    When I try to login without an account
    Then Login fails

  Scenario: A User can create an account
  Given I am at the HomePage