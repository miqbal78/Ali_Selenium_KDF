package com.kdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.kdd.config.DriverManager;
import com.kdd.exceptions.InvalidLocatorException;
import com.kdd.utility.ElementOperations;

public class Ebay_HomePage extends ElementOperations {
	
	private WebDriver driver;
	
	public Ebay_HomePage() {
		driver = DriverManager.getInstance().getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, implicitWaitTime), this);
	}
		
	@FindBy(xpath = "//*[@id='gh-shop-a']")
	private WebElement shopByCatagory;
	
	public void ClickshopByCatagory() {
		shopByCatagory.click();
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Sign in')])[1]")
	private WebElement SignIn;
	
	public void ClickSignIn() {
		SignIn.click();
	}
	 
	@FindBy(xpath = "//*[@id='userid']")
	private WebElement EnterEmail;
	
	public void EnterEmail(String emailid) {
		enterText(EnterEmail, emailid);
	}
		
		@FindBy(xpath ="//*[@id='signin-continue-btn']")
		private WebElement Continue;
		
		public void clickContinue() {
			Continue.click();
		
	}
		@FindBy(xpath = "//*[@id='gh-ug-flex']/a")
		private WebElement register;
		
		public void register() {
			register.click();
		}
		 
}
