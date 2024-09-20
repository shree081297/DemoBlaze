package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;

public class HomePageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;

	@BeforeMethod
	public void startTest() {
		init();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void HomePage() throws Throwable {
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnLogin();
		homepage = loginpage.loginToApp(prop.getProperty("Username"), prop.getProperty("password"));
		boolean phones=homepage.validatePhones();
		Assert.assertTrue(phones);
	}
}
