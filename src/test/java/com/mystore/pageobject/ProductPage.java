package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

	WebDriver ldriver;

	//2. Create constructor
	public ProductPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}

	//Identify the elements present in the login page

	//For new user

	@FindBy(id="quantity_wanted")
	WebElement quantityWanted ;

	@FindBy(id="group_1")
	WebElement size;

	//button[@name='Submit']
	@FindBy(name="Submit")
	WebElement addToCart;

	@FindBy(linkText = "Proceed to checkout")
	WebElement proceed;

	@FindBy(xpath="//a[contains(.,'Faded Short Sleeve T-shirts')]")
	WebElement tshirtProduct;

	@FindBy(xpath="//a[@class='addToWishlist wishlistProd_1']")
	WebElement addToWishList;

	@FindBy(xpath="//p[@class='fancybox-error']")
	WebElement alertForAddToWishList;
	//create actions methods for web elements
	public void setQuantity(String qty)
	{
		quantityWanted.clear();
		quantityWanted.sendKeys(qty);
	}

	//create actions methods for web elements
	public void setSize(String sizeType)
	{
		Select oSelect=new Select(size);
		oSelect.selectByVisibleText(sizeType);	
	}

	public void clickOnAddToCart()
	{
		addToCart.click();
	}

	public void clickOnProceedToCheckOut()
	{
		proceed.click();
	}

	public void mouseOverOnTshirtProduct()
	{
		Actions actionobj = new Actions(ldriver);
		actionobj.moveToElement(tshirtProduct).build().perform();
	}

	public void clickOnAddToWishList()
	{
		addToWishList.click();
	}
	
	public String getTextOfAlertForWishList()
	{
		return(alertForAddToWishList.getText());
	}
}
