package com.snowTest.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snowTest.helper.LoggerHelper;
import com.snowTest.helper.WaitHelper;

public class ResetPasswordPage {
	
	private WebDriver driver;
	Logger logger = LoggerHelper.getLogger(LoginPage.class);

	WaitHelper waitHelper;
	
	@FindBy(xpath = "//h1[text()='Reset your password' and @translate='reset.request.title']")
	public WebElement title_ResetPwd;
	
	public ResetPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public boolean verifyRestPageTitle (String resetPageTitle){
		try{
			return title_ResetPwd.getText().equals(resetPageTitle);
		}catch(NoSuchElementException exception){
			logger.error("Element not found" + exception.toString() );	
			return false;
		}						
	}
	

}
