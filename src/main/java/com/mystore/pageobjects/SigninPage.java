package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Common;
import com.mystore.base.BaseClass;

public class SigninPage extends BaseClass {

	@FindBy(id = "sign-username")
	WebElement Signinuser;

	@FindBy(id = "sign-password")
	WebElement SigninPwd;

	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement signupBtn;

	public SigninPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean ValidateSiginuser()throws Throwable {
		return Common.isDisplayed(driver, Signinuser);
	}

	public boolean ValidateSiginPwd() throws Throwable{
		return Common.isDisplayed(driver, SigninPwd);
	}

	public boolean ValidateSiginBtn() throws Throwable{
		return Common.isDisplayed(driver, signupBtn);
	}
}
