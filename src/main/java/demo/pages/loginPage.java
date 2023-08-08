package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demo.utils.common;

public class loginPage {
	
	private WebDriver driver;
	//Locators
	private By username = By.id("user-name");
	private By pass = By.id("password");
	private By buttonClick = By.id("login-button");
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void getTitleOfPage() {
		driver.findElement(By.xpath("//a/d")).click();
	}
	
	public homePage setCredentials(String user, String password) {
		common.ExpWait(driver, 10, driver.findElement(username));
		driver.findElement(username).sendKeys(user);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(buttonClick).click();
		System.out.println("landed in Product page");

		return new homePage(driver);
	}

}
