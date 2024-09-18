package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(id="nava")
	WebElement logo;
	
	@FindBy(id="login2")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Laptops']")
	WebElement laptopBtn;
	
	@FindBy(xpath="//a[text()='Sony vaio i5']")
	WebElement product;
	
	@FindBy(id="signin2")
	WebElement signin;
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage clickOnLogin() {
		Action.click(driver,loginBtn);
		return new LoginPage();
	}
	public boolean validateLogo() {
		return Action.isDisplayed(driver,logo);
	}
	public String getMytitle() {
		String title=driver.getTitle();
		return title;
	}
	public void clickOnProduct() {
		Action.click(driver, laptopBtn);
	}
	
	public SigninPage clickSigin() {
		Action.click(driver, signin);
		return new SigninPage();
	}
}
