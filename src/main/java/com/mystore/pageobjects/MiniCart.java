package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Common;
import com.mystore.base.BaseClass;

public class MiniCart extends BaseClass{

	@FindBy(xpath="//td[text()='Sony vaio i5']")
	WebElement ProductName;
	
	@FindBy(xpath="//td[text()='790']")
	WebElement ProductPrice;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement placeOrder;
	
	public MiniCart() {
		PageFactory.initElements(driver, this);
	}
	public boolean ValidateProductName()throws Throwable {
		return Common.isDisplayed(driver, ProductName);
	}
	public boolean ValidateProductPrice()throws Throwable {
		return Common.isDisplayed(driver, ProductPrice);
	}
	public CheckoutPage clickOnPlaceOrder()throws Throwable {
		Common.click(driver, placeOrder);
		return new CheckoutPage();
	}
}
