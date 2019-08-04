package com.snowTest.stepDefinitions;

import com.snowTest.helper.WaitHelper;
import com.snowTest.pageObjects.HomePage;
import com.snowTest.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageStepDefinition extends TestBase{
	
	
	HomePage homePage = new HomePage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	
	@Then("^I should see application homepage$")
	public void i_should_see_application_homepage() throws Throwable {
		//homePage.loggedInMsg.isDisplayed();
	}
	
	@When("^I click on Entities$")
	public void i_click_on_Entities() {
		homePage.clickOnEntities();
	}
	
	@When("^I click on Branch$")
	public void i_click_on_Branch() {
		homePage.clickOnBranch();
	}
	
	
}
