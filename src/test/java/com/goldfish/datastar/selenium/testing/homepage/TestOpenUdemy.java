package com.goldfish.datastar.selenium.testing.homepage;


import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.goldfish.datastar.selenium.testing.webdriver.GoldfishDatastarAbstractChromeWebDriverTestNgTest;

public class TestOpenUdemy extends GoldfishDatastarAbstractChromeWebDriverTestNgTest {

	@Test
	public void testOpenUdemyHomepage() throws Exception {

		driver.get("https://www.udemy.com/");

		Thread.sleep(5000);
		System.out.println("sleep-1 5000 > View Udemy Home Page: " + driver.getCurrentUrl());
		assertEquals(driver.getCurrentUrl(), "https://www.udemy.com/");

		Thread.sleep(5000);
		System.out.println("sleep-2 5000 > click OK Button");
		WebElement oKButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
		System.out.println("sleep-3 5000 > View Current Page: " + driver.getCurrentUrl());
		oKButton.click();
	}

}
