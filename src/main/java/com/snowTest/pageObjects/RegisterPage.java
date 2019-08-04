package com.snowTest.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snowTest.helper.LoggerHelper;
import com.snowTest.helper.WaitHelper;

public class RegisterPage {

	private WebDriver driver;
	Logger logger = LoggerHelper.getLogger(LoginPage.class);

	WaitHelper waitHelper;

	// Below are Registration page locators

	@FindBy(xpath = "//h1[text()='Registration' and @translate='register.title']")
	public WebElement title_RegisterPage;

	@FindBy(xpath = "//input[@name = 'login']")
	private WebElement editbx_Login;

	@FindBy(xpath = "//input[@name = 'email']")
	private WebElement editbx_Email;

	@FindBy(xpath = "//input[@name = 'password']")
	private WebElement editbx_Password;

	@FindBy(xpath = "//input[@name = 'confirmPassword']")
	private WebElement editbx_ConfirmPassword;

	@FindBy(xpath = "//button[text() = 'Register']")
	private WebElement btn_Register;

	@FindBy(xpath = "//a[text() = 'login']")
	private WebElement lnk_Login;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	// Below are Registration page methods

	public boolean isRegistrationPageDisplayed(String title) {
		try {
			return (title_RegisterPage.getText().contains(title));

		} catch (NoSuchElementException exception) {
			logger.error("Element not found" + exception.toString());
			return false;
		}

	}

	public void enterLogin(String loginName) {
		try {
			waitHelper.WaitForElement(editbx_Login, 5);
			editbx_Login.sendKeys(loginName);
			;
		} catch (NoSuchElementException exception) {
			logger.error("Element not found" + exception.toString());
		}
	}

	public void enterEmail(String email) {
		try {
			waitHelper.WaitForElement(editbx_Email, 5);
			editbx_Email.clear();
			editbx_Email.sendKeys(email);
		} catch (NoSuchElementException exception) {
			logger.error("Element not found" + exception.toString());
		}
	}

	public void enterPassword(String password) {
		try {
			waitHelper.WaitForElement(editbx_Password, 5);
			editbx_Password.clear();
			;
			editbx_Password.sendKeys(password);
			;
		} catch (NoSuchElementException exception) {
			logger.error("Element not found" + exception.toString());
		}
	}

	public void enterConfirmPassword(String confirmPassword) {
		try {

			waitHelper.WaitForElement(editbx_ConfirmPassword, 5);
			editbx_ConfirmPassword.clear();
			editbx_ConfirmPassword.sendKeys(confirmPassword);
		} catch (NoSuchElementException exception) {
			logger.error("Element not found" + exception.toString());
		}
	}

	public void clickOnRegisterButton() {
		try {
			if (btn_Register.isEnabled())
				btn_Register.click();
		} catch (NoSuchElementException exception) {
			logger.error("Element not found" + exception.toString());
		}
	}

}
