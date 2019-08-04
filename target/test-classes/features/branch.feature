@Login
Feature: Branch feature in Gurukula app
  As an user, I want to search existing branch and also I want to create new branch

  Background: User navigates to Application URL
    Given I am on the startup page URL "http://127.0.0.1:8080"
    Then I should see Welcome Page

  @Sanity
  Scenario: TC005 - Verify Create new branch
    When I click on login
    And I enter username as "admin"
    And I enter password as "admin"
    And click on Authenticate button
    And I click on Entities
    And I click on Branch
    And I click on Create a new branch
    And Enter Name "BranchOne"
    And Enter Code "TC005"
    And Click on Save
    Then I can see created branch
