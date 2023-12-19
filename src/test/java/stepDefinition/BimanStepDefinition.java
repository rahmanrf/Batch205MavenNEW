package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.BimanPage;

public class BimanStepDefinition {

public WebDriver driver;
	
	public BimanPage a;
	
	
	@Given("User open Google browser")
	public void user_open_google_browser() {
		
		String Browsername = "chrome";
		
		if (Browsername.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rrrah\\OneDrive\\Documents\\java project\\Batch205Maven\\Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();}
		
		else if (Browsername.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\rrrah\\OneDrive\\Documents\\java project\\Batch205Maven\\Drivers\\geckodriver.exe");
			
			driver = new FirefoxDriver();}

		
		else if (Browsername.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\rrrah\\OneDrive\\Documents\\java project\\QA Batch 205\\Drivers\\msedgedriver.exe");
			
			driver = new EdgeDriver();}
		
		
		a = new BimanPage(driver);
	}

	@Then("User open Biman Bangladesh url")
	public void user_open_biman_bangladesh_url() {
	    a.user_open_biman_bangladesh_url();
	}

	@Then("User select One way trip")
	public void user_select_one_way_trip() throws InterruptedException {
		 a.user_select_one_way_trip();
	}

	@Then("User select Departing airport")
	public void user_select_departing_airport() throws InterruptedException {
		 a.user_select_departing_airport();
	}

	@Then("User select Arriving airport")
	public void user_select_arriving_airport() throws InterruptedException {
		 a.user_select_arriving_airport();
	}

	@Then("User provide Derarting date")
	public void user_provide_derarting_date() throws InterruptedException {
		 a.user_provide_derarting_date();
	}

	@Then("User click on search flights")
	public void user_click_on_search_flights() throws InterruptedException {
		 a.user_click_on_search_flights();
	}

	@Then("User select a fare")
	public void user_select_a_fare() throws InterruptedException {
		 a.user_select_a_fare();
	}

	@Then("User click on continue to passengers")
	public void user_click_on_continue_to_passengers() throws InterruptedException {
		 a.user_click_on_continue_to_passengers();
	}

	@Then("User provide Passenger Informations")
	public void user_provide_passenger_informations() throws InterruptedException {
		 a.user_provide_passenger_informations();
	}

	@Then("User provide Passenger Contact Information")
	public void user_provide_passenger_contact_information() throws InterruptedException {
		 a.user_provide_passenger_contact_information();
	}

	@Then("User click on Continue to Seat Selection")
	public void user_click_on_continue_to_seat_selection() throws InterruptedException {
		 a.user_click_on_continue_to_seat_selection();
	}

	@Then("User click on Continue to Extras")
	public void user_click_on_continue_to_extras() throws InterruptedException {
		 a.user_click_on_continue_to_extras();
	}

	@Then("User click on Continue to Ancillaries")
	public void user_click_on_continue_to_ancillaries() throws InterruptedException {
		 a.user_click_on_continue_to_ancillaries();
	}

	@Then("User click on Continue to Payment")
	public void user_click_on_continue_to_payment() throws InterruptedException {
		 a.user_click_on_continue_to_payment();
	}

	@Then("User select Bkash as Payment method")
	public void user_select_bkash_as_payment_method() throws InterruptedException {
		 a.user_select_bkash_as_payment_method();
	}

	@Then("User give Billing Data")
	public void user_give_billing_data() throws InterruptedException {
		 a.user_give_billing_data();
	}

	@Then("User click on Terms and Conditions")
	public void user_click_on_terms_and_conditions() throws InterruptedException {
		 a.user_click_on_terms_and_conditions();
	}

	@Then("User click on Pay With Bkash")
	public void user_click_on_pay_with_bkash() throws InterruptedException {
		 a.user_click_on_pay_with_bkash();
	}

	
	
}
	
	
	
