package com.goldfish.datastar.selenium.testing.localhost.login;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.goldfish.datastar.selenium.testing.webdriver.GoldfishDatastarAbstractChromeWebDriverTestNgTest;
public class LogingToLocalhostTest extends GoldfishDatastarAbstractChromeWebDriverTestNgTest{
  
  @Test
  public void loginAndSubmitToSwitchToWelcomePageTest() {
	  driver.get("http://localhost:8080/login");
	  
	  sleep(5);
	  
	  WebElement nameElement = driver.findElement(By.name("name"));
	  nameElement.sendKeys("test");
	  
	  sleep(1);
	  
	  WebElement passwordElement = driver.findElement(By.id("password"));
	  passwordElement.sendKeys("test");
	  
	  sleep(1);
	  
	  WebElement submitElement = driver.findElement(By.id("submit"));
	  submitElement.click();
	  
	  sleep(2);
	  
	  assertEquals(driver.getCurrentUrl(), "http://localhost:8080/welcome");
	  
	  
	  WebElement welcomeMessageElement =   driver.findElement(By.id("welcome-message"));
	  	   
	  //Welcome test!! Click here to manage your todo's.
	  System.out.println(welcomeMessageElement.getText());
	  
  }
}
