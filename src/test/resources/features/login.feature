@Login
Feature: Login to Gurukula
  As an user, I want to login to Gurukula application with my credentials
  In order to use the Gurukula features.

  Background: User navigates to Application URL
    Given I am on the startup page URL "http://127.0.0.1:8080"
    Then I should see Welcome Page

  @Sanity
  Scenario: TC001- Verify Login  with valid credential
    When I click on login
    And I enter username as "admin"
    And I enter password as "admin"
    And click on Authenticate button
    Then I should see application homepage

  @Sanity
  Scenario: TC002- Verify login Fail with invalid credential
    When I click on login
    And I enter username as "Tina"
    And I enter password as "Tina"
    And click on Authenticate button
    Then I should see login error message "Authentication Failed"

  @Sanity
  Scenario: TC003- Verify click on Did you forget your password? link then it navigate to Reset Password page
    When I click on login
    And I click on Did you forget your password link
    Then I see Reset Password page "Reset your password"
