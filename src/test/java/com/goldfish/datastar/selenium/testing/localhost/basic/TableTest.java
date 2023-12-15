package com.goldfish.datastar.selenium.testing.localhost.basic;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.goldfish.datastar.selenium.testing.webdriver.GoldfishDatastarAbstractChromeWebDriverTestNgTest;


public class TableTest extends GoldfishDatastarAbstractChromeWebDriverTestNgTest {
        	
	@Test
	public void testPageTableHtmlTableByUsingCssSelectorToTestBrwoserColumnValues01() {	
		driver.get("http://localhost:8080/pages/tables.html");
		WebElement browserRow1 = driver.findElement(
				By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
		WebElement browserRow2 = driver.findElement(
				By.cssSelector("#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)"));
		WebElement browserRow3 = driver.findElement(
				By.cssSelector("#dataTables-example > tbody > tr:nth-child(3) > td:nth-child(2)"));
		assertEquals(browserRow1.getText(), "Firefox 1.0");		
		assertEquals(browserRow2.getText(), "Firefox 1.5");		
		assertEquals(browserRow3.getText(), "Firefox 2.0");		
	}
	
	@Test
	public void testPageTableHtmlTableByUsingCssSelectorToTestBrwoserColumnValues02() {	
		driver.get("http://localhost:8080/pages/tables.html");
		
		WebElement tableTbody = driver.findElement(
				By.cssSelector("#dataTables-example > tbody"));
		
		WebElement browserRow1 = 
				tableTbody.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)"));

		WebElement browserRow2 = 
				tableTbody.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)"));

		WebElement browserRow3 = 
				tableTbody.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)"));

		assertEquals(browserRow1.getText(), "Firefox 1.0");		
		assertEquals(browserRow2.getText(), "Firefox 1.5");		
		assertEquals(browserRow3.getText(), "Firefox 2.0");		
	}	

}
