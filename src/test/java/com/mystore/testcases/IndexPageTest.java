package com.mystore.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;

public class IndexPageTest extends BaseClass{
	IndexPage indexpage;
	@BeforeMethod
	public void setUp() {
		init();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void VerifyLogo() {
		 indexpage=new IndexPage();
		boolean result=indexpage.validateLogo();
		Assert.assertTrue(result);
	}
	@Test
	public void verifyTitle() throws Throwable {
	String title=indexpage.getMytitle();
	Assert.assertEquals(title, "STORE");
	}
//	@Test
//	public void clickOnProducts() {
//		indexpage.clickOnLogin();
//	}
}
