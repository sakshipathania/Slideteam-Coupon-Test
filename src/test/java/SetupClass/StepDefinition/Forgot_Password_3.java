package SetupClass.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Forgot_Password_3 extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	@Given("^user is already on Website Home Page iii$")
	public void user_is_already_on_Website_Home_Page_iii() throws Throwable {
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
	   
	}

	@Then("^user navigates to sign in page iii$")
	public void user_navigates_to_sign_in_page_iii() throws Throwable {
	    
		 WebElement login_signup_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".t3-navbar > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)")));
		 Thread.sleep(3000);
		 login_signup_btn.click();
		 Thread.sleep(3000);
		
	}

	@Then("^user click on Forgot Password link iii$")
	public void user_click_on_Forgot_Password_link_iii() throws Throwable {
		
		 WebElement forgot_password_link = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("p.pg-login-form-password > a:nth-child(1)")));
		 Thread.sleep(3000);
		forgot_password_link.click();
		 Thread.sleep(3000);
	   
	}

	@Then("^user enter email iii$")
	public void user_enter_email_iii() throws Throwable {
		 WebElement new_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("jform_email")));
		 Thread.sleep(3000);
		 new_email.sendKeys("himanshi.sharma+geeks@slidetech.in");
		 Thread.sleep(3000);
	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		
		 WebElement submit_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-primary")));
		 Thread.sleep(3000);
		submit_btn.click();
		 Thread.sleep(3000);
	  
	}

	@Then("^validate success message$")
	public void validate_success_message() throws Throwable {
	    
	}

}
