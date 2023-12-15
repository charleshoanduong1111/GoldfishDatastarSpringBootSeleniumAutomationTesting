package com.goldfish.datastar.selenium.testing.homepage;


import org.testng.annotations.Test;

import com.goldfish.datastar.selenium.testing.webdriver.GoldfishDatastarAbstractChromeWebDriverTestNgTest;


public class TestOpenFacebook extends GoldfishDatastarAbstractChromeWebDriverTestNgTest {

	@Test
	public void testOpenFacebookHomepage() throws Exception {

		driver.get("https://de-de.facebook.com/");

		Thread.sleep(5000); // Let the user actually see something!

		System.out.println("Curent page: " + driver.getCurrentUrl());

		Thread.sleep(5000); // Let the user actually see something!
	}

}
