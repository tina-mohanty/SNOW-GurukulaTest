package com.snowTest.stepDefinitions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.snowTest.helper.LoggerHelper;
import com.snowTest.helper.WaitHelper;
import com.snowTest.pageObjects.LoginPage;
import com.snowTest.pageObjects.ResetPasswordPage;
import com.snowTest.pageObjects.WelcomePage;
import com.snowTest.pageObjects.HomePage;
import com.snowTest.testBase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition extends TestBase {

	LoginPage loginPage = new LoginPage(driver);
	HomePage homepage = new HomePage(driver);
	WelcomePage welcomepage = new WelcomePage(driver);
	ResetPasswordPage resetPage = new ResetPasswordPage(driver);
	Logger logger =  LoggerHelper.getLogger(LoginPage.class);

	WaitHelper waitHelper;
	
	
	

	@Then("^I should see Welcome Page$")
	public void i_should_see_Log_In_Page() throws Throwable {
		//loginPage.usrname.isDisplayed();
	}
	
	
	

	@When("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String arg1) throws Throwable {
		loginPage.enterUserName(arg1);
	}

	@When("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String arg1) throws Throwable {
		loginPage.enterPassword(arg1);

	}

	@When("^click on Authenticate button$")
	public void click_on_login_button() throws Throwable {
		loginPage.clickOnAuthenticateButton();
	}
	
	@Then("^I should see login error message \"([^\"]*)\"$")
	public void i_should_see_Authentication_Failed_message(String arg1) throws Throwable{
		Assert.assertFalse(loginPage.isLoginAuthenticationFailed(arg1));
		logger.info("Verify Login fail when invalid username/password");
		
	}
	
	@When("^I click on Did you forget your password link$")
		public void i_click_on_Did_you_forget_your_password_link() {
			loginPage.clickOnResetLink();
		}
	@Then("^I see Reset Password page \"([^\"]*)\"$")
		public void i_see_reset_password_page(String arg1) throws Throwable{
			Assert.assertTrue(resetPage.verifyRestPageTitle(arg1));
			logger.info("Reset your password page is displayed.");
		}
	
	@When("^I click on Register a new account$")
	public void i_click_on_Register_a_new_account() {
		loginPage.clickOnRegistrationLink();
		
	}
	
	
}
	
