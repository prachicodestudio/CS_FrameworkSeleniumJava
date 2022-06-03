package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderShippingPage {

	WebDriver ldriver;

	//2. Create constructor
	public OrderShippingPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}

	@FindBy(id="cgv")
	WebElement termOfServices;
	
	
	@FindBy(name = "processCarrier")
	WebElement proceedShipping;
	
	
	
	public void selectTermsOfServices()
	{
		termOfServices.click();
	}
	
	
	public void cickOnProceedToCheckout()
	{
		proceedShipping.click();
	}
}
