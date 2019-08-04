package com.snowTest.stepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.snowTest.helper.LoggerHelper;
import com.snowTest.helper.WaitHelper;
import com.snowTest.pageObjects.LoginPage;
import com.snowTest.pageObjects.RegisterPage;
import com.snowTest.pageObjects.ResetPasswordPage;
import com.snowTest.pageObjects.WelcomePage;
import com.snowTest.pageObjects.HomePage;
import com.snowTest.testBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageStepDefinitions extends TestBase {

	LoginPage loginPage = new LoginPage(driver);
	HomePage homepage = new HomePage(driver);
	WelcomePage welcomepage = new WelcomePage(driver);
	ResetPasswordPage resetPage = new ResetPasswordPage(driver);
	RegisterPage registerPage = new RegisterPage(driver);
	Logger logger =  LoggerHelper.getLogger(LoginPage.class);

	WaitHelper waitHelper;
	
	
	@Then("^I navigate to Registration page \"([^\"]*)\"$")
	public void i_navigate_to_Registration_page(String arg1) {
		Assert.assertTrue(registerPage.isRegistrationPageDisplayed(arg1));
	}
	
	@When("^I enter a login \"([^\"]*)\"$")
	public void i_enter_a_login(String login) {
		registerPage.enterLogin(login);
	}
	
	@When("^I enter an email \"([^\"]*)\"$")
	public void i_enter_an_email(String email) {
		registerPage.enterLogin(email);
	}
	
	@When("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) {
		registerPage.enterLogin(password);
	}
	
	@When("^I enter confirm password \"([^\"]*)\"$")
	public void i_enter_confirm_password(String password) {
		registerPage.enterLogin(password);
	}
	
	@When("^I click on Register$")
	public void i_click_on_Register() {
		registerPage.clickOnRegisterButton();
	}	
	
}
	
	
	
