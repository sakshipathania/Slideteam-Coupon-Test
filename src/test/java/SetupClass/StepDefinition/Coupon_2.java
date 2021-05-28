package SetupClass.StepDefinition;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Coupon_2 extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
         JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on Website Home Page ii$")
	public void user_is_already_on_Website_Home_Page_ii() throws Throwable {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		
	}

	@Then("^user navigates to sign up page ii$")
	public void user_navigates_to_sign_up_page_ii() throws Throwable {
		
		/* WebElement login_signup_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".t3-navbar > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)")));
		 Thread.sleep(3000);
		 login_signup_btn.click();
		 Thread.sleep(3000);*/
		driver.get("https://www.slidegeeks.com/register");
	
		
		 WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_name1")));
		 Thread.sleep(3000);
		 name.sendKeys("Automated Program");
		 Thread.sleep(3000);
	   
	
		// Generate Random Email Address
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
		Thread.sleep(2000);
		
		WebElement new_email = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_email1")));
		 Thread.sleep(3000);
		 new_email.sendKeys(full_email);
		 Thread.sleep(3000);
		
	
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password1")));
		 Thread.sleep(3000);
		password.sendKeys("Geeks@123");
		 Thread.sleep(3000);
		 
		 WebElement confirm_passwoed = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#jform_password2")));
		 Thread.sleep(3000);
		confirm_passwoed.sendKeys("Geeks@123");
		 Thread.sleep(3000);
	    
	
		WebElement captcha = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#captchtext")));
		 Thread.sleep(3000);
		captcha.sendKeys("Y3Tt6bfwI");
		 Thread.sleep(3000);
	    

		WebElement register_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-register-button-new")));
		 Thread.sleep(3000);
		register_btn.click();
		 Thread.sleep(5000);
		

		driver.get("https://www.slidegeeks.com/free-downloads");
		Thread.sleep(6000);
		
		WebElement Download= driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section[2]/div/div/div[1]/div/div[2]/div[1]/div/div/p/a/span"));
		
		//WebElement Download = (WebElement)js.executeScript("('a.btn-download')", "");
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",Download);
		Download.click();
		Thread.sleep(3000);
		
		//Apply Coupon 
		driver.get("https://www.slidegeeks.com/subscriptions");
		Thread.sleep(4000);
		 WebElement Join_now = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#Monthly")));
		Thread.sleep(3000);
		Join_now.click();
		Thread.sleep(3000);
		 WebElement Coupon= driver.findElement(By.cssSelector("#discount-checkbox"));
		Thread.sleep(3000);
		Coupon.click();
		Thread.sleep(3000);
		 WebElement Add_Coupon= driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div[1]/div[1]/form[2]/div[2]/div[2]/input"));
		Thread.sleep(3000);
		Add_Coupon.sendKeys("5OFF");
		Thread.sleep(3000);
		 WebElement Apply_Coupon= driver.findElement(By.cssSelector("#applyPromoCode"));
		Thread.sleep(3000);
		Apply_Coupon.click();
		Thread.sleep(3000);
		//Remove Coupon
		 WebElement Remove_Coupon= driver.findElement(By.cssSelector("#removePromoCode"));
		Thread.sleep(3000);
		Remove_Coupon.click();
		Thread.sleep(3000);
		
		//Checkout
		 WebElement place_order_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.afterBody.checkout-wrapper.main-wrapper.no-left-menu > div.main_wrapper > div > div.checkout-inner-wrapper > div.checkout-box-wrapper.checkout-order > div > div > table > tbody > tr:nth-child(4) > td:nth-child(1) > button.btn.primary-btn.pg-button.pg-checkout-continue")));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",place_order_btn);	
			//js.executeScript("arguments[0].click();", place_order_btn);
			Thread.sleep(2000);
		    place_order_btn.click();
			Thread.sleep(5000);
		
		 String stripe_page_title=driver.getTitle();
		Thread.sleep(3000);
	    System.out.println("Title of the Page is --> "+stripe_page_title);
	    
	    String page_title="https://checkout.stripe.com/";
	    
	    if(page_title.equalsIgnoreCase(stripe_page_title))
	    {
	    	System.out.println(" user is on the Stripe page");
	    	log.info("USER IS ON THE STRIPE PAGE");
	    }
	    else
	    {
	    	System.out.println("user is on the wrong page");
	    	log.info("USER IS ON THE WRONG PAGE");
	    }	
		
		Thread.sleep(3000);
		 WebElement Stripe_back = driver.findElement(By.cssSelector("#root > div > div > div.App-Overview > header > div > div > a > div > div > div.Header-backArrowContainer > svg"));
		Thread.sleep(2000);
			Stripe_back.click();
		Thread.sleep(5000);
					
		//Signout
		 //  driver.get("https://www.slidegeeks.com/component/pago/checkout");
		//Thread.sleep(2000);
	WebElement Account = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/nav/div/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/a"));
		Thread.sleep(3000);
		Account.click();
                 Thread.sleep(3000);
	WebElement Delete_Account = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[2]/div/ul/li[6]/a"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",Delete_Account);	
		Thread.sleep(3000);
		Delete_Account.click();
                 Thread.sleep(3000);
	WebElement Delete_Account_reason = driver.findElement(By.cssSelector("#only-free-download-product"));
		Thread.sleep(3000);
		Delete_Account_reason.click();
                 Thread.sleep(3000);
	WebElement Delete_Profile = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[3]/button[1]"));
		Thread.sleep(3000);
		Delete_Profile.click();
                 Thread.sleep(3000);
	WebElement No_Delete = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/div[3]/button[2]"));
		Thread.sleep(3000);
		No_Delete.click();
                 Thread.sleep(3000);
     //  WebElement Signout = driver.findElement(By.xpath("//a[@href ='/logout']"));
	//	Thread.sleep(3000);
		//Signout.click();
	}

}
