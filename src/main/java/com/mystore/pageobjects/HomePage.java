package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Common;
import com.mystore.base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//a[text()='Phones']")
	WebElement phones;

	@FindBy(xpath = "//a[text()='Laptops']")
	WebElement laptops;

	@FindBy(xpath = "//a[text()='Monitors']")
	WebElement monitors;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public ProductPage ClickOnProduct() throws Throwable {
		//Common.explicitWait(laptops, 6);
		//Common.scrollByVisibilityOfElement(driver, laptops);
		Thread.sleep(6000);
		Common.click(driver, laptops);
		return new ProductPage();
	}

	public boolean validatePhones() throws Throwable{
		return Common.isDisplayed(driver, phones);
	}

	public boolean validatelaptops() throws Throwable{
		return Common.isDisplayed(driver, laptops);
	}

	public boolean validateMonitors()throws Throwable {
		return Common.isDisplayed(driver, monitors);
	}
	public String validateCurrentURL() {
		String HomePageURL=driver.getCurrentUrl();
		return HomePageURL;
	}
}
