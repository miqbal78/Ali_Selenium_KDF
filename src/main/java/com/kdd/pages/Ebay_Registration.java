package com.kdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.kdd.config.DriverManager;
import com.kdd.exceptions.InvalidLocatorException;
import com.kdd.utility.ElementOperations;

public class Ebay_Registration extends ElementOperations {
	
	private WebDriver driver;
	
	public Ebay_Registration() {
		driver = DriverManager.getInstance().getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, implicitWaitTime), this);
	}
		
	
	@FindBy(xpath = "(//*[contains(text(),'Sign in')])[1]")
	private WebElement SignIn1;
	
	public void ClickSignIn1() {
		SignIn1.click();
	}
	
	
	@FindBy(xpath = "(//*[contains(text(),'Sign in')])[1]")
	private WebElement SignIn;
	
	public void ClickSignIn() {
		SignIn.click();
	}
	
	@FindBy(xpath = "//*[@id='firstname']")
	private WebElement EnterFirstName;
	
	public void EnterFirstName(String FirstName) {
		enterText(EnterFirstName, FirstName);
	}
	
	
	@FindBy(xpath = "//*[@id='lastname']")
	private WebElement EnterLastName;
	
	public void EnterLastName(String LastName) {
		enterText(EnterLastName, LastName);
	}
	
	@FindBy(xpath = "//*[@id='Email']")
	private WebElement EnterEmailId;
	
	public void EnterEmailId(String EmailId) {
		enterText(EnterEmailId, EmailId);
	}
	
	@FindBy(xpath = "//*[@id='password']")
	private WebElement EnterPassword;
	
	public void EnterPassword(String Password) {
		enterText(EnterPassword, Password);
	}
	 
	@FindBy(xpath = "//*[@id='EMAIL_REG_FORM_SUBMIT']")
	private WebElement CreateAccount;
	
	public void ClickCreateAccount() {
		CreateAccount.click();
	}
	
	@FindBy(xpath = "//*[@id='Email_err']")
	private WebElement EmailErrorText;
	
	public String GetEmailErrorText() {
		return getElementText(EmailErrorText);
	}
	
}
