package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import demo.base.DriverFactory;
import demo.utils.ConfigReader;
import demo.utils.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	private DriverFactory factory;
	private ConfigReader reader;
	private WebDriver driver;
	Properties prop;
	
	@Before
	public void setup() {
		reader = new ConfigReader();
		prop = reader.init_properties(Constants.browser_properties_path);
		String browserValue = prop.getProperty("browser");
		factory = new DriverFactory();
		driver = factory.init_browser(browserValue);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
