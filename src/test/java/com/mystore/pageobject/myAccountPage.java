package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myAccountPage {

	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public myAccountPage(WebDriver rdriver)
	{
		ldriver = rdriver;


		PageFactory.initElements(rdriver, this);
	}


	//identify webelements
	
	//create new account
	@FindBy(id = "email_create") 
	WebElement createEmailId;

	@FindBy(id="SubmitCreate")
	WebElement SubmitCreate;

	
	//Already registered users
	@FindBy(id = "email") 
	WebElement registeredUsersEmail;
	
	@FindBy(id = "passwd") 
	WebElement registeredUsersPwd;
	
	@FindBy(id = "SubmitLogin")
	WebElement submitLogin;
	
	
	//identify action on webelement
	
	
	
	public void enterCreateEmailAddress(String emailAdd) 
	{
		createEmailId.sendKeys(emailAdd);
	}

	
	public void clickSubmitCreate()
	{
		SubmitCreate.click();
	}
	
	//ACTIONS METHODS FOR ALREADY REGISTERED USERS
	
	public void enterEmailAddress(String emailAdd) 
	{
		registeredUsersEmail.sendKeys(emailAdd);
	}

	public void enterPassword(String pwd) 
	{
		registeredUsersPwd.sendKeys(pwd);
	}

	
	public void clickSignIn()
	{
		submitLogin.click();
	}

}
