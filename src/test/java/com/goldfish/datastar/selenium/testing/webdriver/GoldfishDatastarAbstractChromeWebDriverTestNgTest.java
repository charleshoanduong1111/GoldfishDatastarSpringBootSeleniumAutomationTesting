package com.goldfish.datastar.selenium.testing.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class GoldfishDatastarAbstractChromeWebDriverTestNgTest {

	protected WebDriver driver;

	public GoldfishDatastarAbstractChromeWebDriverTestNgTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		System.err.println("System.setProperty");
		System.setProperty("webdriver.chrome.driver", "./chromedriver-version-120/chromedriver.exe");

		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}