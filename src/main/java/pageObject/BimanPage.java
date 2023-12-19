package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BimanPage {

public WebDriver driver;
	
	public BimanPage(WebDriver d) {
		
		driver = d;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy (xpath = "//a[contains(text(),'ONE WAY')]")
	WebElement OneWay;
	
	@FindBy (xpath = "//input[@id='airport-selection-origin']")
	WebElement DepartClick;
	
	@FindBy (xpath = "//span[contains(text(),'Cox’s Bazar, Cox’s Bazar Airport, Bangladesh (CXB)')]")
	WebElement CoxBazar;
	
	@FindBy (xpath = "//input[@id='airport-selection-destination']")
	WebElement Arrival;
	
	@FindBy (xpath = "//span[contains(text(),'Dhaka, Bangladesh, Hazrat Shahjalal International Airport (DAC)')]")
	WebElement Dhaka;
	
	@FindBy (xpath = "//input[@id='n-departureDate--input']")
	WebElement DepartureDate;
	
	@FindBy (xpath = "//span[contains(text(),'Search Flights')]")
	WebElement SearchFlight;
	
	@FindBy (xpath = "(//button[@class='spark-text-center itinerary-part-offer-price-button economy'])[1]")
	WebElement SelectFare;
	
	@FindBy (xpath = "(//button[@data-test-id='offer-select-button'])[1]")
	WebElement SelectOffer;
	
	@FindBy (xpath = "//span[contains(text(),'Continue to Passengers')]")
	WebElement ContinueToPassengers;
	
	@FindBy (xpath = "//select[@id='prefixPassengerItemAdt1BasicInfoEditNamePrefixPrefix-passenger-item-ADT-1-basic-info-edit-name-prefix']")
	WebElement Prefix;
	
	
	@FindBy (xpath = "//input[@class='field-input first-name-input']")
	WebElement FirstName;
	
	@FindBy (xpath = "//input[@class='field-input last-name-input']")
	WebElement LastName;
	
	@FindBy (xpath = "//input[@id='dayPassengerItemAdt1BasicInfoEditDobDayDay-passenger-item-ADT-1-basic-info-edit-dob-day']")
	WebElement DobDayClick;
	
	@FindBy (xpath = "//li[@data-suggestion-index='0']")
	WebElement DobDay;
	
	@FindBy (xpath = "//input[@id='monthPassengerItemAdt1BasicInfoEditDobMonthMonth-passenger-item-ADT-1-basic-info-edit-dob-month']")
	WebElement DobMonthClick;
	
	@FindBy (xpath = "//li[@data-suggestion-index='0']")
	WebElement DobMonth;
	
	@FindBy (xpath = "//input[@id='yearPassengerItemAdt1BasicInfoEditDobYearYear-passenger-item-ADT-1-basic-info-edit-dob-year']")
	WebElement DobYearClick;
	
	@FindBy (xpath = "//li[@data-suggestion-index='0']")
	WebElement DobYear;
	
	@FindBy (xpath = "//div[@class='field field-phone field-default phone-0 field-use-label-feedback']")
	WebElement PhoneClick;
	
	@FindBy (xpath = "//input[@id='phone0Input-0-required-passenger-item-ADT-1']")
	WebElement PhoneNumber;
	
	@FindBy (xpath = "(//input[@type='email'])[1]")
	WebElement Email;
	
	@FindBy (xpath = "//input[@id='confirmEmailRequiredPassengerItemAdt1ConfirmEmail-required-passenger-item-ADT-1']")
	WebElement ConfirmEmail;
	
	@FindBy (xpath = "//span[contains(text(),'Continue to Seat selection')]")
	WebElement ContinueToSeatSelection;
	
	@FindBy (xpath = "//button[@id='dxp-page-navigation-continue-button']")
	WebElement ContinueToExtra;
	
	@FindBy (xpath = "//span[contains(text(),'Continue to Ancillaries')]")
	WebElement ContinueToAncillaries;
	
	@FindBy (xpath = "//span[contains(text(),'Continue to Payment')]")
	WebElement ContinurToPayment;
	
	@FindBy (xpath = "//label[@class='payment-types-toggle-label AFOP MB-101']")
	WebElement Bkash;
	
	@FindBy (xpath = "//div[@class='field field-phone field-default field-use-label-feedback']")
	WebElement BkashNumberClick;
	
	@FindBy (xpath = "//input[@id='creditCardPhoneInput-undefined-undefined']")
	WebElement BkashNumber;
	
	@FindBy (xpath = "(//span[@class='dxp-checkbox-box'])[2]")
	WebElement CheckBox;
	
	@FindBy(xpath = "//button[contains(text(),'Pay with bKash')]")
	WebElement PayWithBkash;

	public void user_open_biman_bangladesh_url() {
	    driver.get("https://booking.biman-airlines.com/dx/BGDX/#/home");
	    driver.manage().window().maximize();
	}

	
	public void user_select_one_way_trip() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'ONE WAY')]")));
		OneWay.click();
	}

	
	public void user_select_departing_airport() throws InterruptedException {
		DepartClick.sendKeys("Cox");
		Thread.sleep(1000);
	    CoxBazar.click();
	}

	
	public void user_select_arriving_airport() throws InterruptedException {
		
		Arrival.sendKeys("Dhaka");
		Thread.sleep(1000);
	    Dhaka.click();
	}


	public void user_provide_derarting_date() throws InterruptedException {
		Thread.sleep(3000);
	    DepartureDate.sendKeys("12-11-2023");
	    DepartureDate.sendKeys(Keys.ENTER);
	}

	
	public void user_click_on_search_flights() throws InterruptedException {
		Thread.sleep(1000);
	    SearchFlight.click();
	}

	
	public void user_select_a_fare() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='spark-text-center itinerary-part-offer-price-button economy'])[1]")));
	    SelectFare.click();
	    
	    WebDriverWait wait2 = new WebDriverWait(driver, 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@data-test-id='offer-select-button'])[1]")));
	    SelectOffer.click();
	}

	
	public void user_click_on_continue_to_passengers() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Continue to Passengers')]")));
	    ContinueToPassengers.click();
	}

	
	public void user_provide_passenger_informations() throws InterruptedException {
		Thread.sleep(3000);
	    Prefix.sendKeys("Mr");
	    Prefix.sendKeys(Keys.ENTER);
	    
	    Thread.sleep(1000);
	    FirstName.sendKeys("Rubayat");
	    Thread.sleep(1000);
	    LastName.sendKeys("Rahman");
	    
	    Thread.sleep(1000);
	    DobDayClick.click();
	    Thread.sleep(1000);
	    DobDay.click();
	    
	    Thread.sleep(1000);
	    DobMonthClick.click();
	    Thread.sleep(1000);
	    DobMonth.click();
	    
	    Thread.sleep(1000);
	    DobYearClick.sendKeys("1990");
	    Thread.sleep(1000);
	    DobYear.click();
	    
	}

	
	public void user_provide_passenger_contact_information() throws InterruptedException {
		Thread.sleep(1000);
	    PhoneClick.click();
	    Thread.sleep(1000);
	    PhoneNumber.sendKeys("727002233");
	    
	    Thread.sleep(1000);
	    Email.sendKeys("rr.rahman@yahoo.com");
	    
	    Thread.sleep(1000);
	    ConfirmEmail.sendKeys("rr.rahman@yahoo.com");
	}

	
	public void user_click_on_continue_to_seat_selection() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Continue to Seat selection')]")));
	    ContinueToSeatSelection.click();
	}

	
	public void user_click_on_continue_to_extras() throws InterruptedException {
		Thread.sleep(3000);
	    ContinueToExtra.click();
	}

	
	public void user_click_on_continue_to_ancillaries() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Continue to Ancillaries')]")));
	    ContinueToAncillaries.click();
	}

	
	public void user_click_on_continue_to_payment() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Continue to Payment')]")));
	    ContinurToPayment.click();
	}

	
	public void user_select_bkash_as_payment_method() throws InterruptedException {
		Thread.sleep(2000);
	    Bkash.click();
	}

	
	public void user_give_billing_data() throws InterruptedException {
		Thread.sleep(2000);
	    BkashNumberClick.click();
		Thread.sleep(2000);
	    BkashNumber.sendKeys("727002233");
	}

	
	public void user_click_on_terms_and_conditions() throws InterruptedException {
		Thread.sleep(2000);
	    CheckBox.click();
	}

	
	public void user_click_on_pay_with_bkash() throws InterruptedException {
		Thread.sleep(2000);
	    PayWithBkash.click();
	}



	
	
}

