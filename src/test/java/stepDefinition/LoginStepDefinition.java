package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.YoutubePage;

public class LoginStepDefinition {
	
	public WebDriver driver;
	public YoutubePage y;
	
	
	@Given("User open browser")
	
		public void user_open_browser() {
		String Browsername = "chrome";
		
		if (Browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rrrah\\OneDrive\\Documents\\java project\\YouTubePoject\\Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();}
		
		else if (Browsername.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\rrrah\\OneDrive\\Documents\\java project\\YouTubePoject\\Drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();}

		
		else if (Browsername.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\rrrah\\OneDrive\\Documents\\java project\\YouTubePoject\\Drivers\\msedgedriver.exe");
			
			driver = new EdgeDriver();}
		
		
		y = new YoutubePage(driver);
	}

	@Then("User open youtube url")
	public void user_open_youtube_url() throws InterruptedException {
	   y.user_open_youtube_url();
	}

	@Then("User click on signin")
	public void user_click_on_signin() throws InterruptedException {
		 y.user_click_on_signin();
	}

	@Then("User provide user id")
	public void user_provide_user_id() {
		y.user_provide_user_id();
	}

	@Then("User click on next on user id page")
	public void user_click_on_next_on_user_id_page() throws InterruptedException {
		y.user_click_on_next_on_user_id_page();
	}

	@Then("User provide password")
	public void user_provide_password() {
		y.user_provide_password();
	}

	@Then("User click on next on password page")
	public void user_click_on_next_on_password_page() {
		y.user_click_on_next_on_password_page();
	}

	@Then("User click on Not Now")
	public void user_click_on_not_now() {
	   y.user_click_on_not_now();
	}

}
