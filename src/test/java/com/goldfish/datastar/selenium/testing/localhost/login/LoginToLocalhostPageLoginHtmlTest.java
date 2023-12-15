package com.goldfish.datastar.selenium.testing.localhost.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.goldfish.datastar.selenium.testing.webdriver.GoldfishDatastarAbstractChromeWebDriverTestNgTest;

public class LoginToLocalhostPageLoginHtmlTest extends GoldfishDatastarAbstractChromeWebDriverTestNgTest{
  
  @Test
  public void loginToDashboardPage() {
	  driver.get("http://localhost:8080/pages/login.html");
	  
	  sleep(5);
	  
	  WebElement emailElement = driver.findElement(By.name("email"));
	  emailElement.sendKeys("goldfish");
	  
	  sleep(2);
	  
	  WebElement passwordElement = driver.findElement(By.name("password"));
	  passwordElement.sendKeys("goldfish");
	  
	  sleep(2);
	  
	  WebElement loginElement = driver.findElement(By.tagName("a"));
	  loginElement.click();
	  
	  sleep(2);
	  
	  //http://localhost:8080/pages/index.html
	  System.out.println(driver.getCurrentUrl());
	  
  }
}
