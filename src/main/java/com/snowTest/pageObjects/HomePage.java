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

public class HomePage {
	//private WebDriver driver;
	
	private WebDriver driver;

	WaitHelper waitHelper;

	Logger logger = LoggerHelper.getLogger(HomePage.class);

		
		
		@FindBy (xpath =  "//span[text() = 'Entities']")
		public WebElement menu_Entities;
		
		@FindBy (xpath =  "//ul/li/a/span[text() = 'Branch']")
		private WebElement sel_Branch;
		
		
		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
			waitHelper = new WaitHelper(driver);
		}
		
		public void clickOnEntities() {
			try {
				waitHelper.WaitForElement(menu_Entities, 10);
				menu_Entities.click();
			
			}catch(NoSuchElementException e){
				logger.error("Element not clicked");
			}
		}
		
		public void clickOnBranch() {
			try {
				sel_Branch.click();
			}catch(NoSuchElementException e){
				logger.error("Element not clicked");
			}
		}
		
}


