package com.kdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.kdd.config.DriverManager;
import com.kdd.exceptions.InvalidLocatorException;
import com.kdd.utility.ElementOperations;

public class Techlistic_Page extends ElementOperations {
	
	private WebDriver driver;
	
	public Techlistic_Page() {
		driver = DriverManager.getInstance().getDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, implicitWaitTime), this);
	}
	
	@FindBy(xpath = "(//*[contains(text(),'Java')])[1]")
	private WebElement JAVA;
	
	public void ClickJava() {
		JAVA.click();
	}
	
	@FindBy(xpath = "//*[@name='firstname']")
	private WebElement EnterFirstName;
	
	public void EnterFirstName(String FirstName) {
		enterText(EnterFirstName, FirstName);
	}
	
	
	@FindBy(xpath = "//*[@name='lastname']")
	private WebElement EnterLastName;
	
	public void EnterLastName(String LastName) {
		enterText(EnterLastName, LastName);
	}
	@FindBy(xpath = "//*[@id='sex-0']")
	private WebElement Gender;
	
	public void SelectGender() {
		Gender.click();
	}
	@FindBy(xpath = "//*[@id='exp-2']")
	private WebElement YearsofExperience;
	
	public void SelectYearOfExperienc() {
		YearsofExperience.click();
	}
	
	@FindBy(xpath = "//*[@id='datepicker']")
	private WebElement EnterDate;
	
	public void Enterdate(String data) {
		enterText(EnterDate, data);
	}
	@FindBy(xpath = "//*[@id='profession-1']")
	private WebElement Profession;
	
	public void SelectProfession() {
		Profession.click();
	}
	
	@FindBy(xpath = "//*[@id='tool-0']")
	private WebElement AutomationTools;
	
	public void SelectAutomationTools() {
		 AutomationTools.click();
	}
	
	@FindBy(xpath = "//*[@id='continents']")
	private WebElement SelectContinents;
	
	public void SelectContinents(String data) {
		try {
			waitForVisiblityOfElement(driver, SelectContinents, 3);
			selectByVisibleText(SelectContinents, data);
		} catch (InvalidLocatorException e) {
			e.printStackTrace();
			}
		}
		
		@FindBy(xpath ="//*[@id='selenium_commands']")
		private WebElement SeleniumCommands;
		
		public void SelectSeleniumCommands() {
			SeleniumCommands.click();
		}
			
	
	@FindBy(xpath = "//*[@id='submit']")
	private WebElement Button;
	
	public void ClickOnButton() {
		Button.click();
	}
	
	public void ScrollToButton() {
		ScrollForElement(driver, Button);
	}
	
		 
}
