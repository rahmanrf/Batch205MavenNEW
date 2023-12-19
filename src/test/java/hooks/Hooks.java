package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void initializeWebDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rrrah\\OneDrive\\Documents\\java project\\YouTubePoject\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}

	@AfterStep
	public void addScreenshot(Scenario scenario){

	      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		
	}
	@AfterStep
	public void addScreenshot2(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
		
	}
	
	@AfterStep
	public void tearDownWebDriver() {
		driver.quit();
	}





}
