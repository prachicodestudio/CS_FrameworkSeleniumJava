package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAddressPage {

	WebDriver ldriver;

	//2. Create constructor
	public OrderAddressPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}


	//@FindBy(linkText = "Proceed to checkout")
	@FindBy(name="processAddress")
	WebElement proceedfromAddressPage;
	
	public void cickOnProceedToCheckout()
	{
		proceedfromAddressPage.click();
	}
}
