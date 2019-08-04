package com.snowTest.pageObjects;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snowTest.helper.LoggerHelper;
import com.snowTest.helper.WaitHelper;

public class LoginPage {
	
	private WebDriver driver;
	Logger logger = LoggerHelper.getLogger(LoginPage.class);

	WaitHelper waitHelper;
	
	@FindBy(id = "username")
	public WebElement usrname;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(xpath = "html/body/div[3]/div[1]/div/div/div/form/button")
	public WebElement authenticateButton;
	
	@FindBy(xpath = "//div/strong[text() = 'Authentication failed!']")
	public WebElement loginErrorMsg;
	
	@FindBy(linkText = "Did you forget your password?")
	public WebElement link_ResetRequest;
	
	@FindBy(linkText = "Register a new account")
	public WebElement link_Register;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void enterUserName(String userName){
		
	//waitHelper.WaitForElementToInvisible(By.className("modal-footer")); 
	
		usrname.sendKeys(userName);
	}
	
	public void enterPassword(String pswd){
		 password.sendKeys(pswd);
	}
	
	public void clickOnAuthenticateButton() {
		authenticateButton.click();
	}
	
	public boolean isLoginAuthenticationFailed(String authErrMsg){	
		try{
			return loginErrorMsg.getText().contains(authErrMsg);
		}catch(NoSuchElementException exception){
			logger.error("Element not found" + exception.toString() );	
			return false;	
		}		
	}
	
	public void clickOnResetLink() {
		try {
			link_ResetRequest.click();
		}
		catch(NoSuchElementException exception){
			logger.error("Element not found");
		}
	}
	public void clickOnRegistrationLink() {
		try {
			
			link_Register.click();
			
		}
		catch(NoSuchElementException exception){
			logger.error("Element not found");
		}
	}

}
