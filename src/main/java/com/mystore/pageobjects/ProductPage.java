package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class ProductPage extends BaseClass{

	@FindBy(xpath="//a[text()='Sony vaio i5']")
	WebElement product;
	
	@FindBy(id="nava")
	WebElement logo;
	
	/*@FindBy(xpath="//a[text()='Add to cart']")
	WebElement productClick;
	*/
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	public AddToCartPage clickOnProduct() {
		Action.click(driver, product);
		return new  AddToCartPage();
	}
	public boolean validatelogo() {
		return Action.isDisplayed(driver, logo);
	}
}
