package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Email_Sign_In_Free_User_4 extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,30);

	@Given("^user is already on Home Page of Geeks Website iv$")
	public void user_is_already_on_Home_Page_of_Geeks_Website_iv() throws Throwable {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
	}

	@Then("^user navigates to login page iv$")
	public void user_navigates_to_login_page_iv() throws Throwable {
		WebElement login_signup_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".t3-navbar > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)")));
		 Thread.sleep(3000);
		 login_signup_btn.click();
		 Thread.sleep(3000);
	}

	@Then("^user login to website iv$")
	public void user_login_to_website_iv() throws Throwable {
		
		WebElement login_email = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-login-form-username > input:nth-child(1)")));
		 Thread.sleep(3000);
		 login_email.sendKeys("himanshi.sharma+geeks@slidetech.in");
		 Thread.sleep(3000);
		 
		 WebElement login_password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.pg-login-form-password > input:nth-child(1)")));
		 Thread.sleep(3000);
		login_password.sendKeys("123456");
		 Thread.sleep(3000);
		 
		 WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-button-login")));
		 Thread.sleep(3000);
		 login_btn.click();
		 Thread.sleep(3000);
	    
	}

	@Then("^user is redirected to Pricing page iv$")
	public void user_is_redirected_to_Pricing_page_iv() throws Throwable {
		log.info("Hey, I am on Pricing Page");
		 Thread.sleep(3000);
	}

	
	
	@Then("^user signout of website iv$")
	public void user_signout_of_website_iv() throws Throwable {
		
		// Log out
		 WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".t3-navbar > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)")));
		 Thread.sleep(3000);
		 login_btn.click();
		 Thread.sleep(3000);
		 log.info("Hey, I am on Home page Again after Sign out");
		 Thread.sleep(1000);
	}




	
}
