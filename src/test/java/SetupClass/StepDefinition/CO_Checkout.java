package SetupClass.StepDefinition;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.*;
import org.junit.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;

import SetupClass.SetupClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CO_Checkout extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	
	@Given("^user is already on Website Home Page CO$")
	public void user_is_already_on_Website_Home_Page_CO() throws Throwable {
		driver.get(AppURL);
		//driver.get("https://www.slidegeeks.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
		
		try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if(iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);   
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				 Thread.sleep(2000);
					WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
					 Thread.sleep(1000);
						chat1.click();
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();
						 Thread.sleep(1000);
						 driver.switchTo().parentFrame();
					 Thread.sleep(1000);
			}
			else {
				

			System.out.println("chat window does not open");
			}
		}
				catch(NoSuchElementException NCP) {
					
				}
	    
	    
	}

	@Then("^user navigates to sign up page CO$")
	public void user_navigates_to_sign_up_page_CO() throws Throwable {
		
		//WebElement login_signup_btn = driver.findElement(By.xpath("//a[@href ='/register']"));
			driver.get("https://www.slidegeeks.com/register");
		 Thread.sleep(3000); 
		// login_signup_btn.click();
		// Thread.sleep(3000);
	   
	}

	@Then("^user enter name CO$")
	public void user_enter_name_CO() throws Throwable {
		
		 WebElement name =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div/div[1]/div[2]/form/div[1]/div[1]/div/input"));
		 Thread.sleep(3000);
		 name.sendKeys("Automated Program");
		 Thread.sleep(3000);
	   
	}

	@Then("^user enter email CO$")
	public void user_enter_email_CO() throws Throwable {
	   
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
		
		WebElement new_email =  driver.findElement(By.id("jform_email1"));
		 Thread.sleep(3000);
		 new_email.sendKeys(full_email);
		 Thread.sleep(3000);
		
	}

	@Then("^user enter password and confirm password CO$")
	public void user_enter_password_and_confirm_password_CO() throws Throwable {
		
		WebElement password =  driver.findElement(By.id("jform_password1"));
		 Thread.sleep(3000);
		password.sendKeys("Geeks@123");
		 Thread.sleep(3000);
		 
		 WebElement confirm_passwoed =  driver.findElement(By.id("jform_password2"));
		 Thread.sleep(3000);
		confirm_passwoed.sendKeys("Geeks@123");
		 Thread.sleep(3000);
	    
	}

	@Then("^user enter captcha CO$")
	public void user_enter_captcha_CO() throws Throwable {
		
		WebElement captcha =  driver.findElement(By.className("captchaTextBox captchaTextBoxpopup form-control"));
		 Thread.sleep(3000);
		captcha.sendKeys("Y3Tt6bfwI");
		 Thread.sleep(3000);
	    
	}

	@Then("^user click on register button to complete sign up CO$")
	public void user_click_on_register_button_to_complete_sign_up_CO() throws Throwable {
		
		WebElement register_btn =  driver.findElement(By.cssSelector(".pg-register-button-new"));
		 Thread.sleep(3000);
		register_btn.click();
		 Thread.sleep(5000);
		 
		 try
		 {
			// Log out
			 WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header/div/div/nav/div/div[2]/div[2]/div[2]/div/div[2]/ul/li[2]/a")));
			 Thread.sleep(3000);
			 login_btn.click();
			 Thread.sleep(3000);
			 log.info("Hey, I am on Home page Again after Sign out");
			 Thread.sleep(1000);
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 
			 Thread.sleep(1000);
		}
	    
	} 
    @Then("^user is redirected to pricing page and choose a plan to pay (\\d+)CO$")
	public void user_is_redirected_to_pricing_page_and_choose_a_plan_to_pay_CO(int arg1) throws Throwable {
		// choose a plan
		//driver.get("https://www.slidegeeks.com/subscriptions");
		js.executeScript("window.scrollBy(0,1000)");
		 WebElement Subscribe_btn  =  driver.findElement(By.xpath("//button[@type='submit'][contains(.,'BUY NOW')]"));
		js.executeScript("arguments[0].scrollIntoView();",Subscribe_btn);
			Thread.sleep(2000);
		    Subscribe_btn.click();
			Thread.sleep(6000);

	}

	/*@Then("^user is redirected to checkout page (\\d+)CO$")
	public void user_is_redirected_to_checkout_page_CO(int arg1) throws Throwable {
		Thread.sleep(6000);
    WebElement Continue =  driver.findElement(By.xpath("//*[@id='pg-checkout-shipping-info']/div[1]/div/div/div/div[2]/button"));
	js.executeScript("arguments[0].scrollIntoView();",Continue);
		Thread.sleep(1000);
		Continue.click();
	}*/

	@Then("^user proceed to pay with (\\d+)CO (\\d+)CO$")
	public void user_proceed_to_pay_with_CO_CO(int arg1, int arg2) throws InterruptedException {
	    
		Thread.sleep(1400);
		/*// select 2co option
		WebElement co_btn  = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[4]/div/div[3]/div[1]/div[1]/form[1]/div/div[2]/label")));
		js.executeScript("arguments[0].click();",co_btn);
		     Thread.sleep(2000);
	         co_btn.click();
		Thread.sleep(5000);
		     
              WebElement Con_tinue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pg-checkout-col2']/div/div/button")));
	     js.executeScript("arguments[0].click();",Con_tinue);
	     } catch( NoSuchElementException popup) { 
	     }
		
		// place order button 
		try {
			
		 WebElement place_order_btn  =  driver.findElement(By.cssSelector("#place-order-trigger > span"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",place_order_btn);	
			//js.executeScript("arguments[0].click();", place_order_btn);
			Thread.sleep(2000);
		    place_order_btn.click();
			Thread.sleep(5000);
		} catch (NoSuchElementException popup) {
		}
		
		
	}*/
		     try {
		Thread.sleep(1400);
		// select 2co option
		WebElement co_btn  =  driver.findElement(By.cssSelector("#pg-checkout-billing-payment-form > div > div:nth-child(2) > label"));
		Thread.sleep(2000);
	         co_btn.click();
		Thread.sleep(5000);
	     } catch( NoSuchElementException popup) { 
	     }
		
		// place order button 
		try {
			
		 WebElement place_order_btn  =  driver.findElement(By.cssSelector("body > div.afterBody.checkout-wrapper.main-wrapper.no-left-menu > div.main_wrapper > div > div.checkout-inner-wrapper > div.checkout-box-wrapper.checkout-order > div > div > table > tbody > tr:nth-child(4) > td:nth-child(1) > button.btn.primary-btn.pg-button.pg-checkout-continue"));
			Thread.sleep(2000);
			js.executeScript("arguments[0].scrollIntoView();",place_order_btn);	
			//js.executeScript("arguments[0].click();", place_order_btn);
			Thread.sleep(2000);
		    place_order_btn.click();
			Thread.sleep(5000);
		} catch (NoSuchElementException popup) {
		}
		
		
	}

	@Then("^2CO page appears and user navigates back to my account (\\d+)CO$")
	public void paypal_popup_appears_and_user_navigates_back_to_my_account_CO(int arg1) throws Throwable {
	    String co_page_title=driver.getTitle();
		Thread.sleep(3000);
	    System.out.println("Title of the Page is --> "+co_page_title);
	    
	    String page_title="2Checkout";
	    
	    if(page_title.equalsIgnoreCase(co_page_title))
	    {
	    	System.out.println(" user is on the 2checkout page");
	    	log.info("USER IS ON THE 2CHECKOUT PAGE");
	    }
	    else
	    {
	    	System.out.println("user is on the wrong page");
	    	log.info("USER IS ON THE WRONG PAGE");
	    }
		Thread.sleep(3000);
	}

	@Then("^user signout the account (\\d+)CO$")
	public void user_signout_the_account_CO(int arg1) throws Throwable {
		Thread.sleep(3000);
	    driver.get("https://www.slidegeeks.com/");
		Thread.sleep(2000);
		

		/* driver.findElement(By.cssSelector("ul.header > li:nth-child(1) > a:nth-child(1)")).click();
		 Thread.sleep(3000);
		 
		


           try {
			WebElement iframe = driver.findElement(By.id("livechat-full-view"));
			if(iframe.isDisplayed()) {
				driver.switchTo().frame(iframe);   
				 Actions act = new Actions(driver);
				 act.moveToElement(driver.findElement(By.cssSelector("#title .icon-minimize"))).build().perform();
				 Thread.sleep(2000);
					WebElement chat1=driver.findElement(By.cssSelector("#title .icon-minimize"));
					 Thread.sleep(1000);
						chat1.click();
						 Thread.sleep(1000);
						 driver.switchTo().defaultContent();
						 Thread.sleep(1000);
						 driver.switchTo().parentFrame();
					 Thread.sleep(1000);
			}
			else {
				

			System.out.println("chat window does not open");
			}
		}
				catch(NoSuchElementException NCP) {
					
				}


      
		 WebElement delete_account = driver.findElement(By.xpath("//a[contains(text(),'Delete Account')]"));
		js.executeScript("arguments[0].scrollIntoView();",delete_account);
		 delete_account.click();
		 Thread.sleep(3000);
		 WebElement continue_delete = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit'][contains(.,'Continue')]")));
		js.executeScript("arguments[0].scrollIntoView();",continue_delete);
		continue_delete.click();
		 Thread.sleep(3000);
	} */
		

       WebElement Signout = driver.findElement(By.xpath("//a[@href ='/logout']"));
		Thread.sleep(3000);
		Signout.click();
	
}
}
