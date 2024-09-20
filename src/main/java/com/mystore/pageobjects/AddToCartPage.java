package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Common;
import com.mystore.base.BaseClass;

public class AddToCartPage extends BaseClass{

	@FindBy(xpath="//h2[text()='Sony vaio i5']")
	WebElement ProductName;
	
	@FindBy(xpath="//h3[text()='$790']")
	WebElement ProductPrice;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	WebElement AddToCartBtn;
	
	@FindBy(xpath="//a[text()='Cart']")
	WebElement miniCart;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean ValidateProductName() throws Throwable{
		return Common.isDisplayed(driver, ProductName);
	}
	public boolean ValidateProductPrice() throws Throwable{
		return Common.isDisplayed(driver, ProductPrice);
	}
	public void clickOnAddToCart() throws Throwable{
		Common.click(driver, AddToCartBtn);
		Common.Alert(driver);
		
	}
	public MiniCart clickOnMiniCart()throws Throwable {
		Common.click(driver, miniCart);
		return new MiniCart();
	}
	}
