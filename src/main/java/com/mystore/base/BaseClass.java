package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;

	public static WebDriver driver;

	@BeforeTest
	public void loadConfig() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\srika\\eclipse-workspace\\MyStoreProjectPractice\\Configuration\\Config.properties");
			prop.load(ip);
			// System.out.println("driver:"+ driver);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void init() {
		// WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		if (browserName.equals("Chrome")) {
			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();// for opening a browser
		} else if (browserName.equals("edge")) {
			// WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();// for opening a browser
		} else if (browserName.equals("firefox")) {
			// WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();// for opening a browser
		}
		driver.manage().window().maximize();
		/*Action.implicitWait(driver, 10);
		Action.pageLoadTimeOut(driver, 20);
		// driver.manage().deleteAllCookies();*/
		driver.get(prop.getProperty("url"));
	}

}
