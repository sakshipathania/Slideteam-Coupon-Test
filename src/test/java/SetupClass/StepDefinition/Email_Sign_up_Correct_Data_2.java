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

public class Email_Sign_up_Correct_Data_2 extends SetupClass {
	
	WebDriverWait wait = new WebDriverWait(driver,50);
         JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("^user is already on Website Home Page ii$")
	public void user_is_already_on_Website_Home_Page_ii() throws Throwable {
		driver.get(AppURL);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		log.info("It's opening the website URL");
		Thread.sleep(1000);
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
		Thread.sleep(1000);
	    
	}

	@Then("^user navigates to sign up page ii$")
	public void user_navigates_to_sign_up_page_ii() throws Throwable {
		
		 WebElement login_signup_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.afterBody.home-page-wrapper.main-wrapper > header > div > div > nav > div > div.rgth_sechedr > div.navigation_wrapper > div.social_right > div > div.contact.login-option > ul > li:nth-child(2) > a")));
		 Thread.sleep(3000);
		 login_signup_btn.click();
		 Thread.sleep(3000);
	   
	}

	@Then("^user enter name ii$")
	public void user_enter_name_ii() throws Throwable {
		
		 WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.id("jform_name1")));
		 Thread.sleep(3000);
		 name.sendKeys("Automated Program");
		 Thread.sleep(3000);
	   
	}

	@Then("^user enter email ii$")
	public void user_enter_email_ii() throws Throwable {
	   
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
		
		WebElement new_email = wait.until(ExpectedConditions.elementToBeClickable(By.id("jform_email1")));
		 Thread.sleep(3000);
		 new_email.sendKeys(full_email);
		 Thread.sleep(3000);
		
	}

	@Then("^user enter password and confirm password ii$")
	public void user_enter_password_and_confirm_password_ii() throws Throwable {
		
		WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.id("jform_password1")));
		 Thread.sleep(3000);
		password.sendKeys("Geeks@123");
		 Thread.sleep(3000);
		 
		 WebElement confirm_passwoed = wait.until(ExpectedConditions.elementToBeClickable(By.id("jform_password2")));
		 Thread.sleep(3000);
		confirm_passwoed.sendKeys("Geeks@123");
		 Thread.sleep(3000);
	    
	}

	@Then("^user enter captcha ii$")
	public void user_enter_captcha_ii() throws Throwable {
		
		WebElement captcha = wait.until(ExpectedConditions.elementToBeClickable(By.id("captchtext")));
		 Thread.sleep(3000);
		captcha.sendKeys("Y3Tt6bfwI");
		 Thread.sleep(3000);
	    
	}

	@Then("^user click on register button to complete sign up ii$")
	public void user_click_on_register_button_to_complete_sign_up_ii() throws Throwable {
		
		WebElement register_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".pg-register-button-new")));
		 Thread.sleep(3000);
		register_btn.click();
		 Thread.sleep(5000);
		 
		 try
		 {
			// Log out
			 WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".t3-navbar > ul:nth-child(1) > li:nth-child(10) > a:nth-child(1)")));
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
		
		WebElement Free_Slides = driver.findElement(By.className("nav-link"));
		Thread.sleep(3000);
		Free_Slides.click();
		Thread.sleep(2000);
		driver.get("https://www.slidegeeks.com/business/product/roadmap-free-powerpoint-slide");
		Thread.sleep(2000);
		WebElement Download= driver.findElement(By.xpath("//a[contains(text(),'Download this presentation')]"));
		js.executeScript("arguments[0].scrollIntoView();", Download);
		 Download.click();
		Thread.sleep(3000);
							
		WebElement Signout = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		Thread.sleep(3000);
		Signout.click();
	    
	}

}
