package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class LoginTest extends BaseClass{
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	@BeforeMethod
	public void stratTest() {
		init();
	}
	@AfterMethod
	public void tearDown() {
	//	driver.quit();
	}
	@Test
	public void loginTest() throws Throwable {
		 indexpage=new IndexPage();
		 loginpage= indexpage.clickOnLogin();
		homepage= loginpage.loginToApp(prop.getProperty("Username"), prop.getProperty("password"));
		String actualUrl=homepage.validateCurrentURL();
		String ExpectedUrl="https://www.demoblaze.com/index.html";
		Assert.assertEquals(actualUrl, ExpectedUrl);
		/*String actualuser=loginpage.validateUser();
		System.out.println(actualuser);
		String expectedUser="Welcome srikanthkurella123@gmail.com";
		Assert.assertEquals(actualuser, expectedUser);
		*/
	}
}
