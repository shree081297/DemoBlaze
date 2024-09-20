package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Common;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/input")
	WebElement username;
	
	@FindBy(id="loginpassword")
	WebElement password;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	WebElement loginBtn;
	
	@FindBy(id="cat")
	WebElement categories;
	
	@FindBy(id="nameofuser")
	WebElement userName;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage loginToApp(String uname, String pwd)throws Throwable {
		Thread.sleep(4000);
		//Action.fluentWait(username,10);
		Common.explicitWait(username, 4);
		Common.type(username,uname);
	//	Thread.sleep(4000);
		Common.explicitWait(password, 4);
		Common.type(password,pwd);
		Common.click(driver, loginBtn);
		return new HomePage();
	}
	public String validateUser() {
		String user=userName.getText();
		return user;
	}
}
