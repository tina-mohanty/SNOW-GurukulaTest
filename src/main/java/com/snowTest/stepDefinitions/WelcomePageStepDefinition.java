package com.snowTest.stepDefinitions;

import com.snowTest.helper.WaitHelper;
import com.snowTest.pageObjects.HomePage;
import com.snowTest.pageObjects.WelcomePage;
import com.snowTest.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WelcomePageStepDefinition extends TestBase {

	HomePage homePage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	WelcomePage welcomepage = new WelcomePage(driver);

	@Given("^I am on the startup page URL \"([^\"]*)\"$")
	public void i_am_on_the_Login_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		waitHelper = new WaitHelper(driver);

	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
		welcomepage.clickOnLogin();
	}
}