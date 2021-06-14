package SetupClass.StepDefinition;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Keys;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Apply Remove_Apply_Coupon extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	@Given("^user is already on Website Home Page cc$")
	public void user_is_already_on_Website_Home_Page_cc() throws Throwable {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
	    Thread.sleep(2000);
	    try {
			WebElement logout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
			if (logout.isEnabled()) {
				logout.click();
				Thread.sleep(8000);
				driver.navigate().refresh();
				Thread.sleep(2000);
			}
		} catch (NoSuchElementException Ext) {

		}
	    Thread.sleep(3000);
		try {
			driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
			Thread.sleep(2000);
			log.info("It's opening the website URL and redirect user to sign up page");
		} 
		catch (NoSuchElementException popup) {
		}
		
		
		Thread.sleep(3000);
	    driver.get("https://www.slideteam.net/pricing");
		Thread.sleep(4000);
		Thread.sleep(3000);
		 WebElement Join_now = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Individual > div > div.slide-product > div:nth-child(1) > div.col.col2.col-bg2 > span > form > button > span")));
		Thread.sleep(3000);
		Join_now.click();
		Thread.sleep(5000);
		
		WebElement create_account = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#maincontent > div.columns > div > div.login-container.container > div.block.block-new-customer > div.block-content > div > div > a > span")));
		Thread.sleep(3000);
		create_account.click();
		Thread.sleep(2000);
		//driver.get("https://www.slidegeeks.com/register");
		Thread.sleep(3000);
		
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	 
	    System.out.println(generatedString);
	    
	    String signup_email=generatedString;
	    String full_email="selenium.testing."+generatedString+"@gmail.com";
	    System.out.println(full_email);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//driver.findElement(By.id("email_address")).sendKeys(full_email);
		

		Thread.sleep(2000);
	    WebElement new_email_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_address")));
		Thread.sleep(2000);
	    new_email_signup.sendKeys(full_email);
		Thread.sleep(2000);
		
	
		  WebElement new_fname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("firstname")));
		Thread.sleep(2000);
	    new_fname_signup.sendKeys("Selenium");
		Thread.sleep(2000);

	    WebElement new_lname_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("lastname")));
		Thread.sleep(2000);
	    new_lname_signup.sendKeys("Testing");
		Thread.sleep(2000);
	
		 WebElement new_pwd_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
			Thread.sleep(2000);
		    new_pwd_signup.sendKeys("selenium@123");
			Thread.sleep(2000);

		    WebElement new_pwd1_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("password-confirmation")));
			Thread.sleep(2000);
		    new_pwd1_signup.sendKeys("selenium@123");
			Thread.sleep(2000);
		
		WebElement new_captcha_signup = wait.until(ExpectedConditions.elementToBeClickable(By.id("captcha_user_create")));
		Thread.sleep(2000);
	    new_captcha_signup.sendKeys("Aj7W2mtf9namwf55");
		
		
		WebElement new_btn_signup = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".submit")));
		Thread.sleep(2000);
	    new_btn_signup.click();
		Thread.sleep(2000);
	}
	
    
    @Then("^user is redirected to pricing page and choose the plan to pay cc$")
	public void user_is_redirected_to_pricing_page_and_choose_the_plan_to_pay_cc() throws Throwable {
		// choose a plan
		Thread.sleep(4000);
		driver.get("https://www.slideteam.net/pricing");
		Thread.sleep(8000);
		js.executeScript("window.scrollBy(0,1000)");
		 WebElement join_now_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Individual > div > div.slide-product > div:nth-child(2) > div.col.col2.col-bg2 > span > form > button > span")));
			Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",join_now_btn);
		Thread.sleep(3300);
		    join_now_btn.click();
			Thread.sleep(6000);


	}

	@Then("^user is redirected checkout page cc$")
	public void user_is_redirected_checkout_page_cc() throws Throwable {
		Thread.sleep(6000);
    //WebElement Continue =  driver.findElement(By.xpath("//*[@id='pg-checkout-shipping-info']/div[1]/div/div/div/div[2]/button"));
	//js.executeScript("arguments[0].scrollIntoView();",Continue);
		//Thread.sleep(1000);
		//Continue.click();
	}

	@Then("^user proceed to pay with paypal pp cc$")
	public void user_proceed_to_pay_with_paypal_pp_cc() throws Throwable {
	
		Thread.sleep(1400);
		
		   Thread.sleep(1400);
		// select 2co option
		Thread.sleep(1400);
		// select 2co option
		WebElement co_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#amasty_stripe")));
		Thread.sleep(2000);
	         co_btn.click();
		Thread.sleep(5000);
		
		Thread.sleep(3000);
		//Apply coupon

		//WebElement Coupon= driver.findElement(By.cssSelector("#discount-code"));
		//Thread.sleep(3000);
		//Coupon.click();
		//Thread.sleep(3000);
		 WebElement Add_Coupon= driver.findElement(By.cssSelector("#discount-code"));
		Thread.sleep(3000);
		Add_Coupon.sendKeys("5OFF");
		Thread.sleep(3000);
		Thread.sleep(3000);
		 WebElement Apply_Coupon= driver.findElement(By.cssSelector("#discount-form > div.actions-toolbar > div > button > span > span"));
		Thread.sleep(3000);
		Apply_Coupon.click();
		Thread.sleep(3000);
    
		//Remove Coupon
		 WebElement Remove_Coupon= driver.findElement(By.cssSelector("#discount-form > div.actions-toolbar > div > button > span > span"));
		Thread.sleep(3000);
		Remove_Coupon.click();
		Thread.sleep(3000);
    
    //Aplly Coupon Again
		//WebElement Coupon1= driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div[1]/div[1]/form[2]/div[2]/div[1]/label"));
		//Thread.sleep(3000);
		//Coupon1.click();
		//Thread.sleep(3000);
		 WebElement Add_Coupon1= driver.findElement(By.cssSelector("#discount-code"));
		Thread.sleep(3000);
		Add_Coupon1.sendKeys("5OFF");
		Thread.sleep(3000);
		Thread.sleep(3000);
		 WebElement Apply_Coupon1= driver.findElement(By.cssSelector("#discount-form > div.actions-toolbar > div > button > span > span"));
		Thread.sleep(3000);
		Apply_Coupon1.click();
		Thread.sleep(3000);
    
		WebElement Value_after_coupon= driver.findElement(By.xpath("/html/body/div[2]/main/div/div/div/div[4]/div[3]/div/div[1]/div[2]/table/tfoot/tr[3]/td/strong/span"));
		
	      String expected = "$47.49";
              String actual = Value_after_coupon.getText();
              System.out.println(actual);

              if(expected.equals(actual)){
              System.out.println("Coupon applied Successfully");
              }
           else {
            System.out.println("Coupon Error");
        }
		
		
		Thread.sleep(1000);
		   WebElement place_order_btn  =  driver.findElement(By.cssSelector("#place-order-trigger > span"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",place_order_btn);
			//js.executeScript("arguments[0].click();", place_order_btn);
			Thread.sleep(2000);
		    place_order_btn.click();
			Thread.sleep(5000);
			
			WebElement error_message= driver.findElement(By.cssSelector("#checkout > div.messages > div > div"));
								     Thread.sleep(3000);
			System.out.println("Please verify your Card details");
								     Thread.sleep(2000);
								  
		
		
	}

	@Then("^paypal popup appears and user navigates back to my account pp cc$")
	public void paypal_popup_appears_and_user_navigates_back_to_my_account_pp_cc() throws Throwable {
	         
		// page title
		//  String pp_page_title=driver.getTitle();
		//	Thread.sleep(3000);
		//    System.out.println("Title of the Page is --> "+pp_page_title);
		
		//Thread.sleep(2000);
				//  driver.get("https://www.slidegeeks.com/component/pago/checkout");
				 // driver.switchTo().window(currentWindow);
			 
	}


	@Then("^user Signout account PP cc$")
	public void user_Signout_account_PP_cc() throws Throwable {
		Thread.sleep(3000);

		
		 WebElement account = driver.findElement(By.xpath("//a[contains(.,'My Account')]"));
			  Thread.sleep(3000);
			account.click();
		 Thread.sleep(3000);
		 
		

		 WebElement delete_account = driver.findElement(By.cssSelector("#clicking"));
		js.executeScript("arguments[0].scrollIntoView();",delete_account);
		 delete_account.click();
		 Thread.sleep(3000);
		WebElement delete_reason = driver.findElement(By.cssSelector("#exampleRadios1"));
		Thread.sleep(3000);
		delete_reason.click();
		Thread.sleep(3000);
		
		 WebElement delete_profile = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#delete-final")));
		js.executeScript("arguments[0].scrollIntoView();",delete_profile);
		delete_profile.click();
		 Thread.sleep(3000);
		
		WebElement delete_profile_coupon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#flipModal > div > div > div.modal-footer.button_action > button.btn.btn-default.button_2")));
		js.executeScript("arguments[0].scrollIntoView();",delete_profile_coupon);
		delete_profile_coupon.click();
		 Thread.sleep(3000);
	}


	
}
