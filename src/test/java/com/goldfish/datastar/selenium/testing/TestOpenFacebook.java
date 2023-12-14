package com.goldfish.datastar.selenium.testing;

import org.junit.jupiter.api.Test;


public class TestOpenFacebook extends GoldfishDatastarAbstractChromeWebDriverTest {

	@Test
	public void testOpenFacebookHomepage() throws Exception {

		driver.get("https://de-de.facebook.com/");

		Thread.sleep(5000); // Let the user actually see something!

		System.out.println("Curent page: " + driver.getCurrentUrl());

		Thread.sleep(5000); // Let the user actually see something!

	}

}
