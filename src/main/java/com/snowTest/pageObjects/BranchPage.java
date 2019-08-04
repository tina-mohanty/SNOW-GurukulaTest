package com.snowTest.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.snowTest.helper.LoggerHelper;
import com.snowTest.helper.WaitHelper;

public class BranchPage {
	
	private WebDriver driver;
	Logger logger = LoggerHelper.getLogger(LoginPage.class);
	public String createdBranchName;

	WaitHelper waitHelper;
	
	@FindBy (xpath ="//h2[text() = 'Branches']")
	private WebElement title_Branch;
	
	@FindBy (xpath = "//button/span[text() = 'Create a new Branch']")
	private WebElement btn_CreateNewBranch;
	
	@FindBy (xpath = "//input[@ng-model = 'searchQuery']")
	private WebElement txtbx_BranchSearch;
	
	@FindBy (xpath = "//span[text() = 'Search a Branch']")
	private WebElement btn_SearchBranch;
	
	@FindBy (xpath = "//tr/td[2]")
	private WebElement tbl_Branch;
	
	@FindBy (xpath = "//input[@ng-model='branch.name' and @name = 'name']")
	private WebElement editbxBranch_Name;
	
	
	@FindBy (xpath = "//input[@ng-model='branch.code' and @name = 'code']")
	private WebElement editbxBranch_Code;
	
	@FindBy (xpath = "//button/span[text() = 'Save']")
	private WebElement btn_Save;
	
	@FindBy (xpath = "//button/span[text() = 'Cancel']")
	private WebElement btn_Cancel;
	

	@FindBy (xpath =  "//span[text() = 'Entities']")
	private WebElement menu_Entities;
	
	@FindBy (xpath =  "//ul/li/a/span[text() = 'Branch']")
	private WebElement sel_Branch;
	
	@FindBy (xpath =  "//button[1]/span[1][text() = 'View']")
	private WebElement view_Branch;
	
	@FindBy (xpath =  "//tr[1]/td[2]/input")
	private WebElement editbx_ViewBranchName;
	
	@FindBy (xpath =  "//tr[2]/td[2]/input")
	private WebElement editbx_ViewBranchCode;
	
	@FindBy (xpath =  "//button[1]/span[1][text() = 'Edit']")
	private WebElement edit_Branch;
	
	@FindBy (xpath =  "//button[1]/span[1][text() = 'Delete']")
	private WebElement delete_Branch;
	
	@FindBy (xpath =  "//button/span[text() = 'Back']")
	private WebElement backbutton_ViewBranch;
	
	@FindBy (xpath =  "//div/p[@translate = 'entity.validation.minlength' and @translate-value-min='5']")
	private WebElement errMsg_Atleast5Chars;
	
	@FindBy (xpath =  "//div/p[@translate = 'entity.validation.pattern']")
	private WebElement errMsg_AlphNumeric;
	
	public BranchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	// Below are Branch page methods
	
	public void clickOnCreateNewBranchButton (){
		try{
			waitHelper.WaitForElement(btn_CreateNewBranch, 10);
			btn_CreateNewBranch.click();		
			waitHelper.WaitForElement(editbxBranch_Name, 5);			
		} catch(NoSuchElementException exception){
			logger.error("Create Brnach button not found"+exception.toString());						
		}		
	}
	
	public void enterBranchName (String branchName){
		try{
			createdBranchName = branchName;
			 editbxBranch_Name.clear();			
			 editbxBranch_Name.sendKeys(branchName);
		}catch(NoSuchElementException exception){
			logger.error("Element not found"+exception.toString());						
		}				
	}
	
	public void enterBranchCode (String branchCode){
		try{
			editbxBranch_Code.clear();;
		    editbxBranch_Code.sendKeys(branchCode);;
		} catch(NoSuchElementException exception){
			logger.error("Element not found"+exception.toString());						
		}				
	}
	
	
	public void clickOnSave (){
		try{
			//waitHelper.WaitForElementToInvisible(By.className("modal-footer")); 
		btn_Save.click();
		}catch(NoSuchElementException exception){
			logger.error("Element not found"+exception.toString());						
		}						
	}
	
	public void verifyNewBranchCreated() {	
		
		try{
			if((tbl_Branch.isDisplayed() && tbl_Branch.getText().equals(createdBranchName))){
				logger.info("Branch is created.");
			}else {
				logger.info("Branch is not created.");
			}
		}catch(NoSuchElementException exception){
			logger.error("Element not found"+exception.toString());
			
		}					
	}		
	
}
