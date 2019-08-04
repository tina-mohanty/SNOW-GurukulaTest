$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("branch.feature");
formatter.feature({
  "line": 2,
  "name": "Branch feature in Gurukula app",
  "description": "As an user, I want to search existing branch and also I want to create new branch",
  "id": "branch-feature-in-gurukula-app",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 10310037274,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on the startup page URL \"http://127.0.0.1:8080\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should see Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 30
    }
  ],
  "location": "WelcomePageStepDefinition.i_am_on_the_Login_page_URL(String)"
});
formatter.result({
  "duration": 2399346791,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.i_should_see_Log_In_Page()"
});
formatter.result({
  "duration": 17773369,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "TC005 - Verify Create new branch",
  "description": "",
  "id": "branch-feature-in-gurukula-app;tc005---verify-create-new-branch",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I click on login",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter username as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Authenticate button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Entities",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on Branch",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Create a new branch",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Enter Name \"BranchOne\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter Code \"TC005\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click on Save",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I can see created branch",
  "keyword": "Then "
});
formatter.match({
  "location": "WelcomePageStepDefinition.i_click_on_login()"
});
formatter.result({
  "duration": 2200258642,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginPageStepDefinition.i_enter_username_as(String)"
});
formatter.result({
  "duration": 288058076,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginPageStepDefinition.i_enter_password_as(String)"
});
formatter.result({
  "duration": 204508204,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.click_on_login_button()"
});
formatter.result({
  "duration": 136858377,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_on_Entities()"
});
formatter.result({
  "duration": 903624689,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_click_on_Branch()"
});
formatter.result({
  "duration": 158514943,
  "status": "passed"
});
formatter.match({
  "location": "BranchPageStepDefinition.click_on_create_a_new_branch()"
});
formatter.result({
  "duration": 1099847519,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BranchOne",
      "offset": 12
    }
  ],
  "location": "BranchPageStepDefinition.enter_Name(String)"
});
formatter.result({
  "duration": 243220581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TC005",
      "offset": 12
    }
  ],
  "location": "BranchPageStepDefinition.enter_code(String)"
});
formatter.result({
  "duration": 213259007,
  "status": "passed"
});
formatter.match({
  "location": "BranchPageStepDefinition.click_on_Save()"
});
formatter.result({
  "duration": 209196421,
  "status": "passed"
});
formatter.match({
  "location": "BranchPageStepDefinition.i_can_see_created_branch()"
});
formatter.result({
  "duration": 151176048,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2222088796,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Gurukula",
  "description": "As an user, I want to login to Gurukula application with my credentials\nIn order to use the Gurukula features.",
  "id": "login-to-gurukula",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 6857780027,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on the startup page URL \"http://127.0.0.1:8080\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 30
    }
  ],
  "location": "WelcomePageStepDefinition.i_am_on_the_Login_page_URL(String)"
});
formatter.result({
  "duration": 1674543282,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.i_should_see_Log_In_Page()"
});
formatter.result({
  "duration": 4107656,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "TC001- Verify Login  with valid credential",
  "description": "",
  "id": "login-to-gurukula;tc001--verify-login--with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "I click on login",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I enter username as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I enter password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Authenticate button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should see application homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "WelcomePageStepDefinition.i_click_on_login()"
});
formatter.result({
  "duration": 2169483568,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginPageStepDefinition.i_enter_username_as(String)"
});
formatter.result({
  "duration": 310646841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginPageStepDefinition.i_enter_password_as(String)"
});
formatter.result({
  "duration": 255129439,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.click_on_login_button()"
});
formatter.result({
  "duration": 208935370,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.i_should_see_application_homepage()"
});
formatter.result({
  "duration": 217766,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1892947906,
  "status": "passed"
});
formatter.before({
  "duration": 10420704375,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on the startup page URL \"http://127.0.0.1:8080\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 30
    }
  ],
  "location": "WelcomePageStepDefinition.i_am_on_the_Login_page_URL(String)"
});
formatter.result({
  "duration": 1817045727,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.i_should_see_Log_In_Page()"
});
formatter.result({
  "duration": 906317,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "TC002- Verify login Fail with invalid credential",
  "description": "",
  "id": "login-to-gurukula;tc002--verify-login-fail-with-invalid-credential",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I click on login",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I enter username as \"Tina\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I enter password as \"Tina\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on Authenticate button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should see login error message \"Authentication Failed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WelcomePageStepDefinition.i_click_on_login()"
});
formatter.result({
  "duration": 2209669884,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tina",
      "offset": 21
    }
  ],
  "location": "LoginPageStepDefinition.i_enter_username_as(String)"
});
formatter.result({
  "duration": 261554430,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tina",
      "offset": 21
    }
  ],
  "location": "LoginPageStepDefinition.i_enter_password_as(String)"
});
formatter.result({
  "duration": 186108311,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.click_on_login_button()"
});
formatter.result({
  "duration": 212353136,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Authentication Failed",
      "offset": 34
    }
  ],
  "location": "LoginPageStepDefinition.i_should_see_Authentication_Failed_message(String)"
});
formatter.result({
  "duration": 222890246,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1756520152,
  "status": "passed"
});
formatter.before({
  "duration": 8299244021,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "I am on the startup page URL \"http://127.0.0.1:8080\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 30
    }
  ],
  "location": "WelcomePageStepDefinition.i_am_on_the_Login_page_URL(String)"
});
formatter.result({
  "duration": 1330281485,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.i_should_see_Log_In_Page()"
});
formatter.result({
  "duration": 948710,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "TC003- Verify click on Did you forget your password? link then it navigate to Reset Password page",
  "description": "",
  "id": "login-to-gurukula;tc003--verify-click-on-did-you-forget-your-password?-link-then-it-navigate-to-reset-password-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "I click on login",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I click on Did you forget your password link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I see Reset Password page \"Reset your password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WelcomePageStepDefinition.i_click_on_login()"
});
formatter.result({
  "duration": 2196814101,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.i_click_on_Did_you_forget_your_password_link()"
});
formatter.result({
  "duration": 547030550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Reset your password",
      "offset": 27
    }
  ],
  "location": "LoginPageStepDefinition.i_see_reset_password_page(String)"
});
formatter.result({
  "duration": 337130852,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 3081489127,
  "status": "passed"
});
formatter.uri("registerNewAccount.feature");
formatter.feature({
  "line": 2,
  "name": "As a new user I want to register a new Account in Gurukula",
  "description": "",
  "id": "as-a-new-user-i-want-to-register-a-new-account-in-gurukula",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegisterNewAccount"
    }
  ]
});
formatter.before({
  "duration": 8105312197,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the startup page URL \"http://127.0.0.1:8080\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should see Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 30
    }
  ],
  "location": "WelcomePageStepDefinition.i_am_on_the_Login_page_URL(String)"
});
formatter.result({
  "duration": 1873253911,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.i_should_see_Log_In_Page()"
});
formatter.result({
  "duration": 1246800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "TC004- Verify click on Register a new account link, it navigate to Registration page",
  "description": "",
  "id": "as-a-new-user-i-want-to-register-a-new-account-in-gurukula;tc004--verify-click-on-register-a-new-account-link,-it-navigate-to-registration-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I click on Register a new account",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I navigate to Registration page \"Registration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDefinition.i_click_on_Register_a_new_account()"
});
formatter.result({
  "duration": 73603587,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration",
      "offset": 33
    }
  ],
  "location": "RegisterPageStepDefinitions.i_navigate_to_Registration_page(String)"
});
formatter.result({
  "duration": 274338814,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertTrue(Assert.java:42)\r\n\tat org.testng.Assert.assertTrue(Assert.java:52)\r\n\tat com.snowTest.stepDefinitions.RegisterPageStepDefinitions.i_navigate_to_Registration_page(RegisterPageStepDefinitions.java:32)\r\n\tat ✽.Then I navigate to Registration page \"Registration\"(registerNewAccount.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 2904960738,
  "status": "passed"
});
formatter.before({
  "duration": 6788662064,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on the startup page URL \"http://127.0.0.1:8080\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should see Welcome Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://127.0.0.1:8080",
      "offset": 30
    }
  ],
  "location": "WelcomePageStepDefinition.i_am_on_the_Login_page_URL(String)"
});
formatter.result({
  "duration": 1912770863,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDefinition.i_should_see_Log_In_Page()"
});
formatter.result({
  "duration": 765751,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify Registeration with valid input data and is successful",
  "description": "",
  "id": "as-a-new-user-i-want-to-register-a-new-account-in-gurukula;verify-registeration-with-valid-input-data-and-is-successful",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I click on Register a new account",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I navigate to Registration page \"Registration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter a login \"TestLogin\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I enter an email \"testcontina@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter password \"qwerty123!\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter confirm password \"qwerty123!\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Register",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinition.i_click_on_Register_a_new_account()"
});
formatter.result({
  "duration": 417460197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Registration",
      "offset": 33
    }
  ],
  "location": "RegisterPageStepDefinitions.i_navigate_to_Registration_page(String)"
});
formatter.result({
  "duration": 202957959,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestLogin",
      "offset": 17
    }
  ],
  "location": "RegisterPageStepDefinitions.i_enter_a_login(String)"
});
formatter.result({
  "duration": 277200564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testcontina@gmail.com",
      "offset": 18
    }
  ],
  "location": "RegisterPageStepDefinitions.i_enter_an_email(String)"
});
formatter.result({
  "duration": 420058216,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qwerty123!",
      "offset": 18
    }
  ],
  "location": "RegisterPageStepDefinitions.i_enter_password(String)"
});
formatter.result({
  "duration": 181616440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qwerty123!",
      "offset": 26
    }
  ],
  "location": "RegisterPageStepDefinitions.i_enter_confirm_password(String)"
});
formatter.result({
  "duration": 308375024,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageStepDefinitions.i_click_on_Register()"
});
formatter.result({
  "duration": 70556200,
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 1939016581,
  "status": "passed"
});
});