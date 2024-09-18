package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(id="loginusername")
	WebElement username;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	WebElement loginBtn;
	
	@FindBy(id="cat")
	WebElement categories;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginToApp(String uname, String pwd) {
		Action.type(username,uname);
		Action.type(password,pwd);
		Action.click(driver, loginBtn);
		return new HomePage();
	}
}
