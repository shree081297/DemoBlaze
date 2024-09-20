package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.HomePage;
import com.mystore.pageobjects.IndexPage;
import com.mystore.pageobjects.SigninPage;

public class SiginUpPageTest extends BaseClass{
	IndexPage indexPage;
	SigninPage signinpage;
	HomePage homepage;
	@BeforeMethod
	public void starttest() {
		init();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
/*	@Test
	public void VerifySiginDetails() throws Throwable {
		boolean result=signinpage.ValidateSiginuser();
		Assert.assertTrue(result);
		
		/*boolean result1=signinpage.ValidateSiginPwd();
		Assert.assertTrue(result1);
		
		boolean result2=signinpage.ValidateSiginBtn();
		Assert.assertTrue(result2);
	}*/
	
	@Test
	public void singinToApp() throws Throwable {
		indexPage = new IndexPage();
		indexPage.clickSigin();
		signinpage=new SigninPage();
		homepage=signinpage.SigninToApp(prop.getProperty("SiginUser"),prop.getProperty("Siginpass"));
		
	}
}
