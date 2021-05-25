package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demo.utils.common;

public class loginPage {
	
	private WebDriver driver;
	//Locators
	private By username = By.id("user-name");
	private By passwordField = By.id("password");
	private By button = By.id("login-button");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public homePage setCredentials(String user, String password) {
		common.ExpWait(driver, 10, driver.findElement(username));
		driver.findElement(username).sendKeys(user);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(button).click();
		
		return new homePage(driver);
	}

}
