package demo.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo.utils.common;


public class homePage {
	
	private WebDriver driver;
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By threeLine = By.cssSelector(".bm-burger-button>#react-burger-menu-btn");
	private By aboutUs = By.cssSelector(".bm-menu>.bm-item-list>#about_sidebar_link");
	private By price = By.cssSelector(".inventory_item_price");
	private By ClickShoppingCartLink = By.cssSelector(".shopping_cart_link");
	private By checkout = By.cssSelector("#checkout");
	private By Firstname = By.cssSelector("#first-name");
	private By lastName = By.cssSelector("#last-name");
	private By zipCode = By.id("postal-code");
	private By ContButton = By.id("continue"); 
	private By Finish = By.id("finish");
	
	public void clickThreeLine() {
		common.ExpWait(driver, 10, driver.findElement(threeLine));
		driver.findElement(threeLine).click();
		
	}
	
	public void clickAboutUs() {
		common.ExpWait(driver, 10, driver.findElement(aboutUs));
		driver.findElement(aboutUs).click();
	}
	
	public void NavigatebackToProductPage() {
		driver.navigate().back();
	}
	
	public void selectHighestPrice() throws InterruptedException {
		Thread.sleep(4000);
		List<WebElement> li = driver.findElements(price);
		String s = li.get(0).getText().replace("$", "");
		float ff= Float.parseFloat(s);
		
		for(WebElement li1:li) {
			String s1 = li1.getText().replace("$", "_");
			float ff1 = Float.parseFloat(s1);
			if(ff1<ff) {
				ff = ff1;
			}
		}
			driver.findElement(By.xpath("//div[@class='pricebar']/div[text()='"+ ff +"']/parent::div/button")).click();
			Thread.sleep(6000);
		}
	
	public void clickShoppingCartLink() {
		driver.findElement(ClickShoppingCartLink).click();
	}
	
	public void Checkout() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(checkout).click();
	}
	
	public void details() {
		common.ExpWait(driver, 10, driver.findElement(Firstname));
		driver.findElement(Firstname).sendKeys("Varadharajan");
		driver.findElement(lastName).sendKeys("Thiru");
		driver.findElement(zipCode).sendKeys("600049");
		driver.findElement(ContButton).click();
		
	}
	
	public void Finish() throws InterruptedException {
		driver.findElement(Finish).click();
	}

}
