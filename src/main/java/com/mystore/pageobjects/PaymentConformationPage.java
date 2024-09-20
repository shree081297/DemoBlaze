package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class PaymentConformationPage extends BaseClass{

	@FindBy(xpath="//*[text()='Amount: 790 USD']")
	WebElement Price;
	
	@FindBy(xpath="//*[text()='Id: 1045115']")
	WebElement id;
	
	@FindBy(xpath="//*[text()='Card Number: 33333333333333333333333']")
	WebElement card;
	
	@FindBy(xpath="//*[text()='Name: Srikanth Kurella']")
	WebElement name;
	
	@FindBy(xpath="Date: 20/8/2024")
	WebElement date;
	
	public PaymentConformationPage() {
		PageFactory.initElements(driver, this);
	}
	public void validatePrice() {
		String totalprice=Price.getText();
		//String total=totalprice.replaceAll("[^a-zA-Z0-9]", "");
		//double finalTotalPrice=Double.parseDouble(total);
		
	}
}
