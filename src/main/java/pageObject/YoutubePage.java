package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YoutubePage {
	
	public WebDriver driver;
	
	public YoutubePage (WebDriver d){
		
		driver = d;	
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy (xpath = "(//div[@class='yt-spec-touch-feedback-shape__fill'])[4]")
	WebElement signin;
	
	@FindBy (xpath = "//input[@type='email']")
	WebElement email;
	
	@FindBy (xpath = "//div[@id='identifierNext']")
	WebElement emailNext;
	
	@FindBy (xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy (xpath = "//div[@id='passwordNext']")
	WebElement PassNext;
	
	
	
	
		
	
	
	public void user_open_youtube_url() throws InterruptedException {
	   driver.get("https://www.youtube.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	
	public void user_click_on_signin() throws InterruptedException {
	    signin.click();
	    Thread.sleep(3000);
	}

	
	public void user_provide_user_id() {
	    email.sendKeys("fahim.rahman012000");
	}

	
	public void user_click_on_next_on_user_id_page() throws InterruptedException {
	    emailNext.click();
	    Thread.sleep(3000);
	}

	
	public void user_provide_password() {
	    password.sendKeys("RahmanFahim01");
	}

	
	public void user_click_on_next_on_password_page() {
	    PassNext.click();
	}

	
	public void user_click_on_not_now() {
	    
	    driver.getTitle();
	}
	
	
	public void user_click_on_now() {
	    driver.findElement(By.xpath("//input[@type='email']")).click();
	}


}
