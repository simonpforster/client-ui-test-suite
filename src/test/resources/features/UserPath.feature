@Selenium

Feature: UserPath journey tests

  Scenario: A User can not login without an account
    Given I am at the HomePage
    When I try to login without an account
    Then Login fails

  Scenario: A user can register
    Given I am at the HomePage
    When I click register
    When I enter my name
    When I enter my business name
    When I enter my contact number
    When I enter my address
    When I select my business type
    When I enter my password
    When I submit the data
    When I am on the dashboard and I can logout
    When I login
    When I delete my account
    When I click confirm
    When I get a confirmation message
    When I try to login without an account
    Then Login fails

