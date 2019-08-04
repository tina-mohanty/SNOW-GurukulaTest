package com.snowTest.stepDefinitions;

import org.testng.Assert;

import com.snowTest.helper.WaitHelper;
import com.snowTest.pageObjects.BranchPage;
import com.snowTest.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BranchPageStepDefinition extends TestBase{
	
	
	BranchPage branchPage = new BranchPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	@When("^I click on Create a new branch$")
	public void click_on_create_a_new_branch() {
		branchPage.clickOnCreateNewBranchButton();
	}
	
	@When("^Enter Name \"([^\"]*)\"$")
	public void enter_Name(String name) {
		branchPage.enterBranchName(name);
	}
	
	@When("^Enter Code \"([^\"]*)\"$")
	public void enter_code(String code) {
		branchPage.enterBranchCode(code);
	}
	
	@When("^Click on Save$")
	public void click_on_Save() {
		branchPage.clickOnSave();
	}
	
	@Then("^I can see created branch$")
	public void i_can_see_created_branch() {
		branchPage.verifyNewBranchCreated ();
	}
}
