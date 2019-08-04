@RegisterNewAccount
Feature: As a new user I want to register a new Account in Gurukula

  Background: User navigates to Application URL
    Given I am on the startup page URL "http://127.0.0.1:8080"
    Then I should see Welcome Page

  @Sanity
  Scenario: TC004- Verify click on Register a new account link, it navigate to Registration page
    When I click on Register a new account
    Then I navigate to Registration page "Registration"

  @Sanity
  Scenario: Verify Registeration with valid input data and is successful
    When I click on Register a new account
    Then I navigate to Registration page "Registration"
    When I enter a login "TestLogin"
    And I enter an email "testcontina@gmail.com"
    And I enter password "qwerty123!"
    And I enter confirm password "qwerty123!"
    And I click on Register
