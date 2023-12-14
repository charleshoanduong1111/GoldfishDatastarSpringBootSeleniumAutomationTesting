package com.goldfish.datastar.selenium.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class GoldfishDatastarAbstractChromeWebDriverTest {

	protected WebDriver driver;

	public GoldfishDatastarAbstractChromeWebDriverTest() {
		super();
	}

	@BeforeEach
	public void beforeTest() {
		System.err.println("System.setProperty");
		System.setProperty("webdriver.chrome.driver", "./chromedriver-version-120/chromedriver.exe");

		driver = new ChromeDriver();

		// WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		// driver.get("http://www.google.com");
		// driver.quit();

	}

	@AfterEach
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