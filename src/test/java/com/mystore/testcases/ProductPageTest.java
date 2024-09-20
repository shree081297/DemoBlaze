package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.ProductPage;

public class ProductPageTest extends BaseClass {
	IndexPage indexpage;
	LoginPage loginpage;
	HomePage homepage;
	ProductPage productpage;

	@BeforeMethod
	public void startTest() {
		init();
	}

	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}

	@Test
	public void productList() throws Throwable {
		indexpage = new IndexPage();
		loginpage = indexpage.clickOnLogin();
		homepage = loginpage.loginToApp(prop.getProperty("Username"), prop.getProperty("password"));
		 boolean phones=homepage.validatePhones();
		 Assert.assertTrue(phones);
		productpage = homepage.ClickOnProduct();
		productpage.clickProduct();

	}
}
