package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Common;
import com.mystore.base.BaseClass;

public class CheckoutPage extends BaseClass{

	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement cardDetails;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement purchaseBtn;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	public void EnterDetailsInCheckOut(String nm,String cnty, String cty, String cd, String mnth, String yr)throws Throwable {
		Common.type(name, nm);
		Common.type(country, cnty);
		Common.type(city, cty);
		Common.type(cardDetails, cd);
		Common.type(month, mnth);
		Common.type(year, yr);
		Common.pageLoadTimeOut(driver, 10);
		Common.click(driver, purchaseBtn);
	}
	
}
