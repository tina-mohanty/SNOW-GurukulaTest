package com.snowTest.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snowTest.helper.LoggerHelper;
import com.snowTest.helper.WaitHelper;
import com.snowTest.testBase.TestBase;

public class WelcomePage extends TestBase {
//private WebDriver driver;
	Logger logger = LoggerHelper.getLogger(WelcomePage.class);
	WaitHelper waitHelper;

	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		// waitHelper.WaitForElement(userName, 60);

	}

	@FindBy(linkText = "login")
	public WebElement login;

	@FindBy(linkText = "Register a new account")
	public WebElement registerAccount;

	public void clickOnLogin() throws InterruptedException {

		Thread.sleep(2000);
		try {

			login.click();
		} catch (NoSuchElementException exception) {
			logger.error("Element not found" + exception.toString());
		}
	}

}
