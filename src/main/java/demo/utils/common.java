package demo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class common {
	
	public static WebElement ExpWait(WebDriver driver,int timeout, WebElement element ) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		return element;
	}

}
